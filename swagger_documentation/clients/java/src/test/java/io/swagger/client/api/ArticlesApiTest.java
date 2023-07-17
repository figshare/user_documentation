/*
 * Figshare API
 * Figshare apiv2. Using Swagger 2.0
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.AccountReport;
import io.swagger.client.model.Article;
import io.swagger.client.model.ArticleComplete;
import io.swagger.client.model.ArticleCompletePrivate;
import io.swagger.client.model.ArticleConfidentiality;
import io.swagger.client.model.ArticleCreate;
import io.swagger.client.model.ArticleDOI;
import io.swagger.client.model.ArticleEmbargo;
import io.swagger.client.model.ArticleEmbargoUpdater;
import io.swagger.client.model.ArticleHandle;
import io.swagger.client.model.ArticleSearch;
import io.swagger.client.model.ArticleUpdate;
import io.swagger.client.model.ArticleVersions;
import io.swagger.client.model.ArticleWithProject;
import io.swagger.client.model.Author;
import io.swagger.client.model.AuthorsCreator;
import io.swagger.client.model.CategoriesCreator;
import io.swagger.client.model.Category;
import io.swagger.client.model.ConfidentialityCreator;
import io.swagger.client.model.ErrorMessage;
import io.swagger.client.model.FileCreator;
import io.swagger.client.model.FileId;
import io.swagger.client.model.Location;
import io.swagger.client.model.LocationWarnings;
import io.swagger.client.model.LocationWarningsUpdate;
import io.swagger.client.model.PrivateArticleSearch;
import io.swagger.client.model.PrivateFile;
import io.swagger.client.model.PrivateLink;
import io.swagger.client.model.PrivateLinkCreator;
import io.swagger.client.model.PrivateLinkResponse;
import io.swagger.client.model.PublicFile;
import io.swagger.client.model.Resource;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ArticlesApi
 */
@Ignore
public class ArticlesApiTest {

    private final ArticlesApi api = new ArticlesApi();

    
    /**
     * Account Article Report
     *
     * Return status on all reports generated for the account from the oauth credentials
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountArticleReportTest() throws ApiException {
        Long groupId = null;
        List<AccountReport> response = api.accountArticleReport(groupId);

        // TODO: test validations
    }
    
    /**
     * Initiate a new Report
     *
     * Initiate a new Article Report for this Account. There is a limit of 1 report per day.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountArticleReportGenerateTest() throws ApiException {
        AccountReport response = api.accountArticleReportGenerate();

        // TODO: test validations
    }
    
    /**
     * View article details
     *
     * View an article
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void articleDetailsTest() throws ApiException {
        Long articleId = null;
        ArticleComplete response = api.articleDetails(articleId);

        // TODO: test validations
    }
    
    /**
     * Article file details
     *
     * File by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void articleFileDetailsTest() throws ApiException {
        Long articleId = null;
        Long fileId = null;
        PublicFile response = api.articleFileDetails(articleId, fileId);

        // TODO: test validations
    }
    
    /**
     * List article files
     *
     * Files list for article
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void articleFilesTest() throws ApiException {
        Long articleId = null;
        List<PublicFile> response = api.articleFiles(articleId);

        // TODO: test validations
    }
    
    /**
     * Public Article Confidentiality for article version
     *
     * Confidentiality for article version. The confidentiality feature is now deprecated. This has been replaced by the new extended embargo functionality and all items that used to be confidential have now been migrated to items with a permanent embargo on files. All API endpoints related to this functionality will remain for backwards compatibility, but will now be attached to the new extended embargo workflows.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void articleVersionConfidentialityTest() throws ApiException {
        Long articleId = null;
        Long vNumber = null;
        ArticleConfidentiality response = api.articleVersionConfidentiality(articleId, vNumber);

        // TODO: test validations
    }
    
    /**
     * Article details for version
     *
     * Article with specified version
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void articleVersionDetailsTest() throws ApiException {
        Long articleId = null;
        Long vNumber = null;
        ArticleComplete response = api.articleVersionDetails(articleId, vNumber);

        // TODO: test validations
    }
    
    /**
     * Public Article Embargo for article version
     *
     * Embargo for article version
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void articleVersionEmbargoTest() throws ApiException {
        Long articleId = null;
        Long vNumber = null;
        ArticleEmbargo response = api.articleVersionEmbargo(articleId, vNumber);

        // TODO: test validations
    }
    
    /**
     * Update article version
     *
     * Updating an article version by passing body parameters; request can also be made with the PATCH method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void articleVersionUpdateTest() throws ApiException {
        Long articleId = null;
        Long versionId = null;
        ArticleUpdate article = null;
        LocationWarningsUpdate response = api.articleVersionUpdate(articleId, versionId, article);

        // TODO: test validations
    }
    
    /**
     * Update article version thumbnail
     *
     * For a given public article version update the article thumbnail by choosing one of the associated files
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void articleVersionUpdateThumbTest() throws ApiException {
        Long articleId = null;
        Long versionId = null;
        FileId fileId = null;
        api.articleVersionUpdateThumb(articleId, versionId, fileId);

        // TODO: test validations
    }
    
    /**
     * List article versions
     *
     * List public article versions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void articleVersionsTest() throws ApiException {
        Long articleId = null;
        List<ArticleVersions> response = api.articleVersions(articleId);

        // TODO: test validations
    }
    
    /**
     * Public Articles
     *
     * Returns a list of public articles
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void articlesListTest() throws ApiException {
        UUID xCursor = null;
        Long page = null;
        Long pageSize = null;
        Long limit = null;
        Long offset = null;
        String order = null;
        String orderDirection = null;
        Long institution = null;
        String publishedSince = null;
        String modifiedSince = null;
        Long group = null;
        String resourceDoi = null;
        Long itemType = null;
        String doi = null;
        String handle = null;
        List<Article> response = api.articlesList(xCursor, page, pageSize, limit, offset, order, orderDirection, institution, publishedSince, modifiedSince, group, resourceDoi, itemType, doi, handle);

        // TODO: test validations
    }
    
    /**
     * Public Articles Search
     *
     * Returns a list of public articles, filtered by the search parameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void articlesSearchTest() throws ApiException {
        UUID xCursor = null;
        ArticleSearch search = null;
        List<ArticleWithProject> response = api.articlesSearch(xCursor, search);

        // TODO: test validations
    }
    
    /**
     * Delete article author
     *
     * De-associate author from article
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleAuthorDeleteTest() throws ApiException {
        Long articleId = null;
        Long authorId = null;
        api.privateArticleAuthorDelete(articleId, authorId);

        // TODO: test validations
    }
    
    /**
     * Add article authors
     *
     * Associate new authors with the article. This will add new authors to the list of already associated authors
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleAuthorsAddTest() throws ApiException {
        Long articleId = null;
        AuthorsCreator authors = null;
        api.privateArticleAuthorsAdd(articleId, authors);

        // TODO: test validations
    }
    
    /**
     * List article authors
     *
     * List article authors
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleAuthorsListTest() throws ApiException {
        Long articleId = null;
        List<Author> response = api.privateArticleAuthorsList(articleId);

        // TODO: test validations
    }
    
    /**
     * Replace article authors
     *
     * Associate new authors with the article. This will remove all already associated authors and add these new ones
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleAuthorsReplaceTest() throws ApiException {
        Long articleId = null;
        AuthorsCreator authors = null;
        api.privateArticleAuthorsReplace(articleId, authors);

        // TODO: test validations
    }
    
    /**
     * Add article categories
     *
     * Associate new categories with the article. This will add new categories to the list of already associated categories
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleCategoriesAddTest() throws ApiException {
        Long articleId = null;
        CategoriesCreator categories = null;
        api.privateArticleCategoriesAdd(articleId, categories);

        // TODO: test validations
    }
    
    /**
     * List article categories
     *
     * List article categories
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleCategoriesListTest() throws ApiException {
        Long articleId = null;
        List<Category> response = api.privateArticleCategoriesList(articleId);

        // TODO: test validations
    }
    
    /**
     * Replace article categories
     *
     * Associate new categories with the article. This will remove all already associated categories and add these new ones
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleCategoriesReplaceTest() throws ApiException {
        Long articleId = null;
        CategoriesCreator categories = null;
        api.privateArticleCategoriesReplace(articleId, categories);

        // TODO: test validations
    }
    
    /**
     * Delete article category
     *
     * De-associate category from article
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleCategoryDeleteTest() throws ApiException {
        Long articleId = null;
        Long categoryId = null;
        api.privateArticleCategoryDelete(articleId, categoryId);

        // TODO: test validations
    }
    
    /**
     * Delete article confidentiality
     *
     * Delete confidentiality settings. The confidentiality feature is now deprecated. This has been replaced by the new extended embargo functionality and all items that used to be confidential have now been migrated to items with a permanent embargo on files. All API endpoints related to this functionality will remain for backwards compatibility, but will now be attached to the new extended embargo workflows.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleConfidentialityDeleteTest() throws ApiException {
        Long articleId = null;
        api.privateArticleConfidentialityDelete(articleId);

        // TODO: test validations
    }
    
    /**
     * Article confidentiality details
     *
     * View confidentiality settings. The confidentiality feature is now deprecated. This has been replaced by the new extended embargo functionality and all items that used to be confidential have now been migrated to items with a permanent embargo on files. All API endpoints related to this functionality will remain for backwards compatibility, but will now be attached to the new extended embargo workflows.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleConfidentialityDetailsTest() throws ApiException {
        Long articleId = null;
        ArticleConfidentiality response = api.privateArticleConfidentialityDetails(articleId);

        // TODO: test validations
    }
    
    /**
     * Update article confidentiality
     *
     * Update confidentiality settings. The confidentiality feature is now deprecated. This has been replaced by the new extended embargo functionality and all items that used to be confidential have now been migrated to items with a permanent embargo on files. All API endpoints related to this functionality will remain for backwards compatibility, but will now be attached to the new extended embargo workflows.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleConfidentialityUpdateTest() throws ApiException {
        Long articleId = null;
        ConfidentialityCreator reason = null;
        api.privateArticleConfidentialityUpdate(articleId, reason);

        // TODO: test validations
    }
    
    /**
     * Create new Article
     *
     * Create a new Article by sending article information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleCreateTest() throws ApiException {
        ArticleCreate article = null;
        LocationWarnings response = api.privateArticleCreate(article);

        // TODO: test validations
    }
    
    /**
     * Delete article
     *
     * Delete an article
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleDeleteTest() throws ApiException {
        Long articleId = null;
        api.privateArticleDelete(articleId);

        // TODO: test validations
    }
    
    /**
     * Article details
     *
     * View a private article
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleDetailsTest() throws ApiException {
        Long articleId = null;
        ArticleCompletePrivate response = api.privateArticleDetails(articleId);

        // TODO: test validations
    }
    
    /**
     * Delete Article Embargo
     *
     * Will lift the embargo for the specified article
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleEmbargoDeleteTest() throws ApiException {
        Long articleId = null;
        api.privateArticleEmbargoDelete(articleId);

        // TODO: test validations
    }
    
    /**
     * Article Embargo Details
     *
     * View a private article embargo details
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleEmbargoDetailsTest() throws ApiException {
        Long articleId = null;
        ArticleEmbargo response = api.privateArticleEmbargoDetails(articleId);

        // TODO: test validations
    }
    
    /**
     * Update Article Embargo
     *
     * Note: setting an article under whole embargo does not imply that the article will be published when the embargo will expire. You must explicitly call the publish endpoint to enable this functionality.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleEmbargoUpdateTest() throws ApiException {
        Long articleId = null;
        ArticleEmbargoUpdater embargo = null;
        api.privateArticleEmbargoUpdate(articleId, embargo);

        // TODO: test validations
    }
    
    /**
     * Single File
     *
     * View details of file for specified article
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleFileTest() throws ApiException {
        Long articleId = null;
        Long fileId = null;
        PrivateFile response = api.privateArticleFile(articleId, fileId);

        // TODO: test validations
    }
    
    /**
     * File Delete
     *
     * Complete file upload
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleFileDeleteTest() throws ApiException {
        Long articleId = null;
        Long fileId = null;
        api.privateArticleFileDelete(articleId, fileId);

        // TODO: test validations
    }
    
    /**
     * List article files
     *
     * List private files
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleFilesListTest() throws ApiException {
        Long articleId = null;
        List<PrivateFile> response = api.privateArticleFilesList(articleId);

        // TODO: test validations
    }
    
    /**
     * List private links
     *
     * List private links
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticlePrivateLinkTest() throws ApiException {
        Long articleId = null;
        List<PrivateLink> response = api.privateArticlePrivateLink(articleId);

        // TODO: test validations
    }
    
    /**
     * Create private link
     *
     * Create new private link for this article
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticlePrivateLinkCreateTest() throws ApiException {
        Long articleId = null;
        PrivateLinkCreator privateLink = null;
        PrivateLinkResponse response = api.privateArticlePrivateLinkCreate(articleId, privateLink);

        // TODO: test validations
    }
    
    /**
     * Disable private link
     *
     * Disable/delete private link for this article
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticlePrivateLinkDeleteTest() throws ApiException {
        Long articleId = null;
        String linkId = null;
        api.privateArticlePrivateLinkDelete(articleId, linkId);

        // TODO: test validations
    }
    
    /**
     * Update private link
     *
     * Update existing private link for this article
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticlePrivateLinkUpdateTest() throws ApiException {
        Long articleId = null;
        String linkId = null;
        PrivateLinkCreator privateLink = null;
        api.privateArticlePrivateLinkUpdate(articleId, linkId, privateLink);

        // TODO: test validations
    }
    
    /**
     * Private Article Publish
     *
     * - If the whole article is under embargo, it will not be published immediately, but when the embargo expires or is lifted. - When an article is published, a new public version will be generated. Any further updates to the article will affect the private article data. In order to make these changes publicly visible, an explicit publish operation is needed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticlePublishTest() throws ApiException {
        Long articleId = null;
        Location response = api.privateArticlePublish(articleId);

        // TODO: test validations
    }
    
    /**
     * Private Article Reserve DOI
     *
     * Reserve DOI for article
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleReserveDoiTest() throws ApiException {
        Long articleId = null;
        ArticleDOI response = api.privateArticleReserveDoi(articleId);

        // TODO: test validations
    }
    
    /**
     * Private Article Reserve Handle
     *
     * Reserve Handle for article
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleReserveHandleTest() throws ApiException {
        Long articleId = null;
        ArticleHandle response = api.privateArticleReserveHandle(articleId);

        // TODO: test validations
    }
    
    /**
     * Private Article Resource
     *
     * Edit article resource data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleResourceTest() throws ApiException {
        Long articleId = null;
        Resource resource = null;
        Location response = api.privateArticleResource(articleId, resource);

        // TODO: test validations
    }
    
    /**
     * Update article
     *
     * Updating an article by passing body parameters; request can also be made with the PATCH method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleUpdateTest() throws ApiException {
        Long articleId = null;
        ArticleUpdate article = null;
        LocationWarningsUpdate response = api.privateArticleUpdate(articleId, article);

        // TODO: test validations
    }
    
    /**
     * Complete Upload
     *
     * Complete file upload
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleUploadCompleteTest() throws ApiException {
        Long articleId = null;
        Long fileId = null;
        api.privateArticleUploadComplete(articleId, fileId);

        // TODO: test validations
    }
    
    /**
     * Initiate Upload
     *
     * Initiate a new file upload within the article. Either use the link property to point to an existing file that resides elsewhere and will not be uploaded to Figshare or use the other 3 parameters (md5, name, size).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticleUploadInitiateTest() throws ApiException {
        Long articleId = null;
        FileCreator file = null;
        Location response = api.privateArticleUploadInitiate(articleId, file);

        // TODO: test validations
    }
    
    /**
     * Private Articles
     *
     * Get Own Articles
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticlesListTest() throws ApiException {
        Long page = null;
        Long pageSize = null;
        Long limit = null;
        Long offset = null;
        List<Article> response = api.privateArticlesList(page, pageSize, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Private Articles search
     *
     * Returns a list of private articles filtered by the search parameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateArticlesSearchTest() throws ApiException {
        PrivateArticleSearch search = null;
        List<ArticleWithProject> response = api.privateArticlesSearch(search);

        // TODO: test validations
    }
    
}