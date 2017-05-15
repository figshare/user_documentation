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

function processSampleCodes(sampleCodes) {
    var other_sample_codes = $('#other_sample_codes').html();

    for (var tagIndex = 0; tagIndex<swaggerUi.api.apisArray.length; tagIndex++)
        {
        var tagName = swaggerUi.api.apisArray[tagIndex].name;
        for (var i=0; i<swaggerUi.api.apisArray[tagIndex].operationsArray.length; i++)
            {
            var nickname = swaggerUi.api.apisArray[tagIndex].operationsArray[i].nickname;
            var nicknameCamel = ToCamelCase(nickname);
            $('#'+tagName+'_'+nickname+' .content .heading').after(sampleCodes[nicknameCamel]);
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
      processAdditionalDescriptions(data['x-additional-descriptions']);
  });
}

function processAdditionalDescriptions(desc) {
  for (var i=0; i<desc.length; i++) {
    title = desc[i].title;
    var resource_id = 'resource_'+ToSmallCase(title);
    if (desc[i].position=='bottom')
      addfunction = 'append';
      else
      addfunction = 'prepend';
    $('#resources_nav')[addfunction]('<div data-resource="'+resource_id+'" label="'+title+'"></div>');
    $('#resources')[addfunction]('<li id="'+resource_id+'" class="resource"><ul class="endpoints"><li class="endpoint"><ul class="operations"></ul></li></ul></div>');

    for (var j=0; j<desc[i]['subsections'].length; j++)
        {
        title  = desc[i]['subsections'][j]['title'];
        content = $(desc[i]['subsections'][j].content).html();
        $('div[data-resource="'+resource_id+'"]').append('<div data-endpoint="description_'+ToSmallCase(title)+'" class="item">'+title+'</div>');
        $('#'+resource_id+' .operations').append('<li class="operation" id="description_'+ToSmallCase(title)+'"><div class="content">'+content+'</div></li>');
        $('#'+resource_id+' .operations .operation').css('min-height','auto');
        }

    $('div[data-resource="'+resource_id+'"]').click(function(event){
      event.stopPropagation();
      window.scrollTo(0,$('#'+$(this).attr('data-resource')).offset().top);
      $('#resources_nav div').removeClass('active');
      $('#resources_nav div').removeAttr('data-selected');
      $(this).addClass('active');
      $($(this).find('div')[0]).attr('data-selected',true);
    });
    $('div[data-resource="'+resource_id+'"] .item').click(function(event){
      event.stopPropagation();
      window.scrollTo(0,$('#'+$(this).attr('data-endpoint')).offset().top);
        $('#resources_nav div').removeAttr('data-selected');
        $(this).attr('data-selected',true);
    });
  }
}
