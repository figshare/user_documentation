var sampleCodes = new Array();


function getSampleCodes() {
    $.getJSON("sample_code.json", function(data) {
        sampleCodes = data;
        processSampleCodes(sampleCodes);
    });
}


function addSampleCodesToOperations(){
    getSampleCodes();
}


function ToCamelCase(s){
    return s.replace(/(\_\w)/g, function(m){return m[1].toUpperCase();});
}


function ToSmallCase(s){
    return s.replace(/(\ \w)/g, function(m){return m[1].toLowerCase();});
}

function ToSmallUnderscoredCase(s) {
    s = s.replace(/ /gi,'_');
    return s.toLowerCase();
}


function processSampleCodes(sampleCodes) {
    var other_sample_codes = $('#other_sample_codes').html();

    for (var tagIndex = 0; tagIndex<swaggerUi.api.apisArray.length; tagIndex++)
        {
        var tagName = swaggerUi.api.apisArray[tagIndex].name;
        for (var i=0; i<swaggerUi.api.apisArray[tagIndex].operationsArray.length; i++)
            {
            var nickname = swaggerUi.api.apisArray[tagIndex].operationsArray[i].nickname;
            var nicknameCamel = ToCamelCase(nickname);

            $('#'+nickname+' .content .heading').after(sampleCodes[nicknameCamel]);
            if (typeof(swaggerUi.api.apisArray[tagIndex].operationsArray[i].successResponse)!='undefined') {
              var resp_key = Object.keys(swaggerUi.api.apisArray[tagIndex].operationsArray[i].successResponse);
              $('#'+nickname+' .content .responses-wrapper table tbody').prepend('<tr><td><strong>'+swaggerUi.api.apisArray[tagIndex].operationsArray[i].successCode+'</srong></td><td>'+swaggerUi.api.apisArray[tagIndex].operationsArray[i].successResponse[resp_key[0]].description+'</td></tr>');
              }

            }
        }
      var ul_examples = $('ul.nav-tabs-examples');
      for (var i=0; i<ul_examples.length; i++){
            var lis = $(ul_examples[i]).find('li');
            $(lis[2]).hide();
            $(lis[3]).hide();
            $(lis[4]).hide();
            var id = $(lis[0]).find('a').attr('href')+'other';
            $(ul_examples[i]).append('<li><a href="'+id+'">Other</a></li>');
            $(ul_examples[i]).parent().find('.tab-content').append('<div class="tab-pane" id="'+(id.substr(1))+'">'+other_sample_codes+'</div>');

        }

    $('ul.nav-tabs-examples li a').click(function() {
        var id = $(this).attr('href');
         var tabs = $(this).parent().parent().parent().find('.tab-content');
         $(tabs).find('.tab-pane').removeClass('active');
         $(tabs).find(id).addClass('active');
         $(this).parent().parent().find('li').removeClass('active');
         $(this).parent().addClass('active');
         return false;
    });

}

function addAdditionalDescriptions() {
  $.getJSON("/swagger_parsed.json", function(data) {
      replaceMenus(data);
  });
  let collapse_titles = $('[data-toggle="collapse"]');
  for (let i=0; i<collapse_titles.length; i++)
    if ($(collapse_titles[i]).hasClass('collapsed'))
        $(collapse_titles[i]).append('<span data-close="" class="icon_budicon_collapse icon-budicon-460"></span>');
        else
        $(collapse_titles[i]).append('<span data-close="" class="icon_budicon_collapse icon-budicon-462"></span>');
  $('[data-toggle="collapse"]').click(function() {
    if ($(this).hasClass('collapsed')) {
        $(this).find('.icon_budicon_collapse').removeClass('icon-budicon-460');
        $(this).find('.icon_budicon_collapse').addClass('icon-budicon-462');
      }
      else {
        $(this).find('.icon_budicon_collapse').removeClass('icon-budicon-462');
        $(this).find('.icon_budicon_collapse').addClass('icon-budicon-460');
      }
  })
}


function replaceMenus(data) {
  let menu = [];
  for (var i=0; i<swaggerUi.api.apisArray.length; i++)
    {
    var submenu = [];
    for (var j=0; j<swaggerUi.api.apisArray[i].operationsArray.length; j++)
      {
      if (typeof(swaggerUi.api.apisArray[i].operationsArray[j].operation["x-subcategory"])!='undefined')
        {
        let tag = swaggerUi.api.apisArray[i].operationsArray[j].operation["x-subcategory"];
        submenu.push({
          "name": swaggerUi.api.apisArray[i].operationsArray[j].summary,
          "id": swaggerUi.api.apisArray[i].operationsArray[j].nickname,
          "subtag": tag
        });
        }
        else {
        submenu.push({
          "name": swaggerUi.api.apisArray[i].operationsArray[j].summary,
          "id": swaggerUi.api.apisArray[i].operationsArray[j].nickname,
        });
        }
      }
    menu.push({"name":swaggerUi.api.apisArray[i].name,"submenu":submenu});
    }

  original_operations = $('#resources .operations .operation');
  for (var i=0; i<original_operations.length; i++)
    {
    let id = $(original_operations[i]).attr('id');
    id = id.substr(id.indexOf('_')+1);
    $(original_operations[i]).attr('id', id);
    }

  menu_html = '';
  for (var i=0; i<menu.length; i++)
    {
    menu_html += '<li><span>'+menu[i].name+'<span data-close="" class="icon_figmenu_collapse"></span></span><ul class="submenu">';
    var subtags = [];
    for (var j=0; j<menu[i].submenu.length; j++)
      if (typeof(menu[i].submenu[j].subtag)=='undefined')
        menu_html += '<li><span endpoint_id="'+menu[i].submenu[j].id+'">'+menu[i].submenu[j].name+'</span></li>';
        else {
          if (subtags.indexOf(menu[i].submenu[j].subtag) == -1) {

            $('#'+menu[i].submenu[j].id).before('<li class="operation" id="'+ToSmallUnderscoredCase(menu[i].submenu[j].subtag)+'"><div class="content"><h2 class="operation-title">'+menu[i].submenu[j].subtag+'</h2></div></li>');
            $('#'+ToSmallUnderscoredCase(menu[i].submenu[j].subtag)).css('min-height', 'auto');

            menu_html += '<li><span endpoint_id="'+ToSmallUnderscoredCase(menu[i].submenu[j].subtag)+'">'+menu[i].submenu[j].subtag+'<span data-close="" class="icon_figmenu_collapse"></span></span><ul class="subsubmenu">';
            for (var k=j; k<menu[i].submenu.length; k++)
              if (typeof(menu[i].submenu[k].subtag)!='undefined')
                if (menu[i].submenu[k].subtag == menu[i].submenu[j].subtag)
                  {
                  menu_html += '<li><span endpoint_id="'+menu[i].submenu[k].id+'">'+menu[i].submenu[k].name+'</span></li>';
                  $('#'+menu[i].name+'_'+menu[i].submenu[k].id).find('h2.operation-title').removeClass('operation-title');
                  }
            menu_html += '</ul></li>';
            subtags.push(menu[i].submenu[j].subtag);
          }
        }
    menu_html += '</ul></li>';
    }



  additional_menu = processAdditionalDescriptions(data['x-additional-descriptions']);
  presenters_menu = createPresentersHtml();
  menu_html = '<ul>'+additional_menu['top'] + menu_html + additional_menu['bottom'] + presenters_menu + '</ul>';
  $('#resources_nav').html(menu_html);
  $('#resources_nav ul li span').click(menuSpanClicked);
  $(window).scroll(windowScrolling);

  $('#resources_nav').prepend('<input type="text" class="ui-form-control" id="search_doc" placeholder="Search doc" />');
  $('#search_doc').after('<div class="search_doc_autocomplete"></div>');
  $('#search_doc').keyup(SearchDocAutoComplete);
  $('#search_doc').focusout(SearchFocusOut);
  $('#search_doc').focusin(SearchFocusIn);
  prepareSearchList();
  correctMethodLinks();
  addPutPostSchemaIndication();
  $('.param-property textarea.ui-form-control').keydown(ParamTextareaTabHandle);
  $(window).keyup(escKeyForModal);
}


function processAdditionalDescriptions(desc) {
  additional_menu = {"bottom":"","top":""};
  for (var i=0; i<desc.length; i++) {
    menu = '<li><span endpoint_id="'+ToSmallUnderscoredCase(desc[i].title)+'">'+desc[i].title+'<span data-close="" class="icon_figmenu_collapse"></span></span><ul class="submenu">';
    for (var j=0; j<desc[i].subsections.length; j++)
      if (typeof(desc[i].subsections[j].subsections) == 'undefined')
        menu += '<li><span endpoint_id="'+ToSmallUnderscoredCase(desc[i].title)+'_'+ToSmallUnderscoredCase(desc[i].subsections[j].title)+'">'+desc[i].subsections[j].title+'</span></li>';
        else {
          menu += '<li><span endpoint_id="'+ToSmallUnderscoredCase(desc[i].title)+'_'+ToSmallUnderscoredCase(desc[i].subsections[j].title)+'">'+desc[i].subsections[j].title+'<span data-close="" class="icon_figmenu_collapse"></span></span><ul class="subsubmenu">';
          for (var k=0; k<desc[i].subsections[j].subsections.length; k++)
              menu += '<li><span endpoint_id="'+ToSmallUnderscoredCase(desc[i].title)+'_'+ToSmallUnderscoredCase(desc[i].subsections[j].title)+'_'+ToSmallUnderscoredCase(desc[i].subsections[j].subsections[k].title)+'">'+desc[i].subsections[j].subsections[k].title+'</span></li>';
          menu += '</ul></li>';
        }
    menu += '</ul></li>';
    additional_menu[desc[i].position] += menu;
    }

  for (var i=0; i<desc.length; i++) {
    title = desc[i].title;
    var resource_id = 'resource_'+ToSmallUnderscoredCase(title);
    if (desc[i].position=='bottom')
      addfunction = 'append';
      else
      addfunction = 'prepend';
    //$('#resources_nav')[addfunction]('<div data-resource="'+resource_id+'" label="'+title+'"></div>');
    $('#resources')[addfunction]('<li id="'+resource_id+'" class="resource"><ul class="endpoints"><li class="endpoint"><ul class="operations"></ul></li></ul></li>');
    $('#'+resource_id+' .operations').append('<li class="operation static_description" id="'+ToSmallUnderscoredCase(title)+'"><div class="content"><h2 class="operation-title">'+title+'</h2></div></li>');

    for (var j=0; j<desc[i]['subsections'].length; j++)
        {
        title  = desc[i]['subsections'][j]['title'];
        if (typeof(desc[i]['subsections'][j].subsections)!='undefined')
          {
          $('#'+resource_id+' .operations').append('<li class="operation static_description" id="'+ToSmallUnderscoredCase(desc[i].title)+'_'+ToSmallUnderscoredCase(title)+'"><div class="content"><h2 class="operation-title">'+title+'</h2></div></li>');
          for (var k=0; k<desc[i].subsections[j].subsections.length; k++)
            {

              content = $('#'+desc[i]['subsections'][j].subsections[k].content).html();
              title  = desc[i]['subsections'][j].subsections[k]['title'];
              $('#'+resource_id+' .operations').append('<li class="operation static_description" id="'+ToSmallUnderscoredCase(desc[i].title)+'_'+ToSmallUnderscoredCase(desc[i].subsections[j].title)+'_'+ToSmallUnderscoredCase(title)+'"><div class="content">'+content+'</div></li>');
            }

          }
          else
          {
          content = $('#'+desc[i]['subsections'][j].content).html();
          //$('div[data-resource="'+resource_id+'"]').append('<div data-endpoint="description_'+ToSmallUnderscoredCase(title)+'" class="item">'+title+'</div>');
          $('#'+resource_id+' .operations').append('<li class="operation static_description" id="'+ToSmallUnderscoredCase(desc[i].title)+'_'+ToSmallUnderscoredCase(title)+'"><div class="content">'+content+'</div></li>');
          }
        }
        $('#'+resource_id+' .operations .operation').css('min-height','auto');
  }
  return additional_menu;
}

function createPresentersHtml() {
    const models = swaggerUi.api.models;
    let menu = '<li><span endpoint_id="description_presenters">Presenters<span data-close="" class="icon_figmenu_collapse"></span></span><ul class="submenu">';
    model_keys = Object.keys(models);
    model_keys = model_keys.sort();
    for (var i = 0; i<model_keys.length; i++) {
        key = model_keys[i];
        menu += '<li><span endpoint_id="description_presenters_'+ToSmallUnderscoredCase(models[key].name)+'">'+models[key].name+'</span></li>';
    }
    menu += '</ul></li>';

    $('#resources').append('<li id="description_presenters" class="resource"><ul class="endpoints"><li class="endpoint"><ul class="operations"></ul></li></ul></li>');
    for (var i = 0; i<model_keys.length; i++) {
        key = model_keys[i];
        var presenterHtml = '<li class="operation static_description" id="description_presenters_'+ToSmallUnderscoredCase(models[key].name)+'"><div class="content"><h2 class="operation-title">'+models[key].name+'</h2><ul class="presenter_properties">';
        properties = models[key].definition.properties;
        propKeys = Object.keys(properties);
        for (var j=0; j<propKeys.length; j++)
            {
            propKey = propKeys[j];
            var prop = properties[propKey];
            presenterHtml += '<li><span class="propName">'+propKey+'</span>';
            if (typeof(prop['$ref']) != 'undefined')
                presenterHtml += '<span class="propType" title="object">'+prop['$ref'].substr(prop['$ref'].lastIndexOf('/')+1)+'</span>';
            if (prop.type == 'array')
                {
                presenterHtml += '<span class="propType" title="'+prop.type+'">array[';
                if (typeof(prop.items.type)!='undefined')
                    presenterHtml += prop.items.type;
                if (typeof(prop.items['$ref'])!='undefined')
                    presenterHtml += prop.items['$ref'].substr(prop.items['$ref'].lastIndexOf('/')+1);
                presenterHtml += ']</span>';
                }
                else
                presenterHtml += '<span class="propType" title="'+prop.type+'">'+prop.type+'</span>';
            if (typeof(prop.description) != 'undefined')
                presenterHtml += '<span class="propDesc">'+prop.description+'</span>';
                else
                presenterHtml += '<span class="propDesc"></span>';
            if (typeof(prop.example) != 'undefined')
                presenterHtml += '<span class="propExample">'+JSON.stringify(prop.example)+'</span>';
            presenterHtml += '</li>';

            }
        presenterHtml += '</ul></div></li>';
        $('#description_presenters .operations').append(presenterHtml);
    }

    return menu;
}


function menuSpanClicked() {
  if ($(this).attr('endpoint_id')) {
      window.location.hash = $(this).attr('endpoint_id');
      window.scrollTo(0,$('#'+$(this).attr('endpoint_id')).offset().top);
  }
  else {
    //if ($(span).get(0) != $('#resources_nav li.active>span').get(0))
  }
  if ($(this).parent().hasClass('active'))
    DeActivateMenuEndpoint(this);
    else
    ActivateMenuEndpoint(this);

}

function DeActivateMenuEndpoint(span) {
  var p = $(span).parent();
  $(p).removeClass('active');
  $(p).find('li.active').removeClass('active');
}

function ActivateMenuEndpoint(span) {
  $('#resources_nav ul').removeClass('active');
  $('#resources_nav li').removeClass('active');
  var p = $(span).parent();
  $(p).addClass('active');
  if ($(p).parent().hasClass('submenu'))
    $(p).parent().parent().addClass('active');
  if ($(p).parent().hasClass('subsubmenu'))
    {
    $(p).parent().parent().addClass('active');
    $(p).parent().parent().parent().parent().addClass('active');
    }
}


function windowScrolling() {
  var top = $(window).scrollTop();
  var navpoints = $('#resources_nav li span[endpoint_id]');
  for (var i=0; i<navpoints.length; i++) {
    let topComp = $('#'+$(navpoints[i]).attr('endpoint_id')).offset().top-100;
    if (topComp<=top && $('#'+$(navpoints[i]).attr('endpoint_id')).height()+topComp>top)
      {
      ActivateMenuEndpoint(navpoints[i]);
      break;
      }
    }
}


var searchDocList = [];
function prepareSearchList() {
  let spans = $('#resources_nav span');
  for (var i=0; i<spans.length; i++)
    {
    let val = $(spans[i]).text();
    val = val.toLowerCase();
    val = val.replace(" ","");
    searchDocList.push({
      val: val,
      span: spans[i]
    });
    }
}


function SearchDocAutoComplete() {
  var search_term = $('#search_doc').val();
  search_term = search_term.toLowerCase();
  search_term = search_term.replace(" ","");
  if (search_term.length>1) {
    let search_results = [];
    for (var i=0; i<searchDocList.length; i++)
      if (searchDocList[i].val.search(search_term)>-1)
        search_results.push({
          str: $(searchDocList[i].span).text(),
          index: i
        });

    $('.search_doc_autocomplete').html('');
    for (var i=0; i<search_results.length; i++)
      {
      $('.search_doc_autocomplete').append('<div span_index="'+search_results[i].index+'">'+search_results[i].str+'</div>');
      }
    $('.search_doc_autocomplete').addClass('active');
    $('.search_doc_autocomplete div').click(clickSearchSuggestion);
  }
}

function clickSearchSuggestion() {
  $('.search_doc_autocomplete').removeClass('active');
  span = searchDocList[parseInt($(this).attr('span_index'))].span;
  ActivateMenuEndpoint(span);
  if ($(span).attr('endpoint_id'))
    $(span).click();
}

function SearchFocusOut() {
  window.setTimeout(function() {
    $('.search_doc_autocomplete').removeClass('active');
  }, 300);
}

function SearchFocusIn() {
  if ($('.search_doc_autocomplete div').length>0)
    $('.search_doc_autocomplete').addClass('active');
}

function ParamTextareaTabHandle(event) {
  if(event.keyCode===9)
    {
    var v=this.value,s=this.selectionStart,e=this.selectionEnd;
    this.value=v.substring(0, s)+'\t'+v.substring(e);
    this.selectionStart=this.selectionEnd=s+1;
    return false;
    }
}

function verifyHashOnLoad() {
  let hash = window.location.hash;
  if(hash == "#!/articles/articles_list") {
    if(window.history.pushState) {
        window.history.pushState('', '/', window.location.pathname)
    } else {
        window.location.hash = '';
    }
  }
  else
  if ($(hash).length>0)
    {
    window.scrollTo(0,$(hash).offset().top);
    }

}

function addPutPostSchemaIndication() {
  for (var i=0; i<swaggerUi.api.apisArray.length; i++)
    {
    for (var j=0; j<swaggerUi.api.apisArray[i].operationsArray.length; j++)
      if (typeof(swaggerUi.api.apisArray[i].operationsArray[j].method)!='undefined')
        if (swaggerUi.api.apisArray[i].operationsArray[j].method == 'post' || swaggerUi.api.apisArray[i].operationsArray[j].method == 'put') {
            var tagName = swaggerUi.api.apisArray[i].name;
            var nickname = swaggerUi.api.apisArray[i].operationsArray[j].nickname;
            $('#'+nickname+' .content .operation-params').prepend('<div class="parameter-item body_schema_indicator">See complete body description in Body Schema section to the right</div>');
        }

    }
}

function verifyDuplicateLinks() {
  let ls = $('[endpoint_id]');
  let links = new Array();
  for (var i=0; i<ls.length; i++)
    {
    l = $(ls[i]).attr('endpoint_id');
    if (links.indexOf(l)>=0)
      {
      //console.log(l);
      }
    links.push(l);
    }
}

function verifyBrokenLinks() {
  let links = $('[href]');
  for (var i=0; i<links.length; i++)
    {
    let href = $(links[i]).attr('href');
    if (href[0] == '#' && href.length>1)
      {
      if ($(href).length==0)
        console.log(href);
      }
    }
}

function correctMethodLinks() {
  let method_links = $('.operation .http_method a');
  for (var i=0; i<method_links.length; i++) {
    $(method_links[i]).attr('href','#'+$(method_links[i]).parent().parent().parent().parent().parent().attr('id'));
  }
  method_links = $('.operation .path a');
  for (var i=0; i<method_links.length; i++) {
    $(method_links[i]).attr('href','#'+$(method_links[i]).parent().parent().parent().parent().parent().attr('id'));
  }
}

function escKeyForModal(evt) {
  if (e.which == 27 && $('.modal.in').length>0) {
    $('.modal.in').removeClass('in');
    evt.preventDefault();
  }
}
