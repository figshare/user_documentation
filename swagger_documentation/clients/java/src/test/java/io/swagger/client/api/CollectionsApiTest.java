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
import io.swagger.client.model.Article;
import io.swagger.client.model.ArticlesCreator;
import io.swagger.client.model.Author;
import io.swagger.client.model.AuthorsCreator;
import io.swagger.client.model.CategoriesCreator;
import io.swagger.client.model.Category;
import io.swagger.client.model.Collection;
import io.swagger.client.model.CollectionComplete;
import io.swagger.client.model.CollectionCompletePrivate;
import io.swagger.client.model.CollectionCreate;
import io.swagger.client.model.CollectionDOI;
import io.swagger.client.model.CollectionHandle;
import io.swagger.client.model.CollectionPrivateLinkCreator;
import io.swagger.client.model.CollectionSearch;
import io.swagger.client.model.CollectionUpdate;
import io.swagger.client.model.CollectionVersions;
import io.swagger.client.model.ErrorMessage;
import io.swagger.client.model.Location;
import io.swagger.client.model.LocationWarnings;
import io.swagger.client.model.LocationWarningsUpdate;
import io.swagger.client.model.PrivateCollectionSearch;
import io.swagger.client.model.PrivateLink;
import io.swagger.client.model.PrivateLinkResponse;
import io.swagger.client.model.Resource;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CollectionsApi
 */
@Ignore
public class CollectionsApiTest {

    private final CollectionsApi api = new CollectionsApi();

    
    /**
     * Public Collection Articles
     *
     * Returns a list of public collection articles
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void collectionArticlesTest() throws ApiException {
        Long collectionId = null;
        Long page = null;
        Long pageSize = null;
        Long limit = null;
        Long offset = null;
        List<Article> response = api.collectionArticles(collectionId, page, pageSize, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Collection details
     *
     * View a collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void collectionDetailsTest() throws ApiException {
        Long collectionId = null;
        CollectionComplete response = api.collectionDetails(collectionId);

        // TODO: test validations
    }
    
    /**
     * Collection Version details
     *
     * View details for a certain version of a collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void collectionVersionDetailsTest() throws ApiException {
        Long collectionId = null;
        Long versionId = null;
        CollectionComplete response = api.collectionVersionDetails(collectionId, versionId);

        // TODO: test validations
    }
    
    /**
     * Collection Versions list
     *
     * Returns a list of public collection Versions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void collectionVersionsTest() throws ApiException {
        Long collectionId = null;
        List<CollectionVersions> response = api.collectionVersions(collectionId);

        // TODO: test validations
    }
    
    /**
     * Public Collections
     *
     * Returns a list of public collections
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void collectionsListTest() throws ApiException {
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
        String doi = null;
        String handle = null;
        List<Collection> response = api.collectionsList(xCursor, page, pageSize, limit, offset, order, orderDirection, institution, publishedSince, modifiedSince, group, resourceDoi, doi, handle);

        // TODO: test validations
    }
    
    /**
     * Public Collections Search
     *
     * Returns a list of public collections
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void collectionsSearchTest() throws ApiException {
        UUID xCursor = null;
        CollectionSearch search = null;
        List<Collection> response = api.collectionsSearch(xCursor, search);

        // TODO: test validations
    }
    
    /**
     * Delete collection article
     *
     * De-associate article from collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionArticleDeleteTest() throws ApiException {
        Long collectionId = null;
        Long articleId = null;
        api.privateCollectionArticleDelete(collectionId, articleId);

        // TODO: test validations
    }
    
    /**
     * Add collection articles
     *
     * Associate new articles with the collection. This will add new articles to the list of already associated articles
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionArticlesAddTest() throws ApiException {
        Long collectionId = null;
        ArticlesCreator articles = null;
        Location response = api.privateCollectionArticlesAdd(collectionId, articles);

        // TODO: test validations
    }
    
    /**
     * List collection articles
     *
     * List collection articles
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionArticlesListTest() throws ApiException {
        Long collectionId = null;
        Long page = null;
        Long pageSize = null;
        Long limit = null;
        Long offset = null;
        List<Article> response = api.privateCollectionArticlesList(collectionId, page, pageSize, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Replace collection articles
     *
     * Associate new articles with the collection. This will remove all already associated articles and add these new ones
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionArticlesReplaceTest() throws ApiException {
        Long collectionId = null;
        ArticlesCreator articles = null;
        api.privateCollectionArticlesReplace(collectionId, articles);

        // TODO: test validations
    }
    
    /**
     * Delete collection author
     *
     * Delete collection author
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionAuthorDeleteTest() throws ApiException {
        Long collectionId = null;
        Long authorId = null;
        api.privateCollectionAuthorDelete(collectionId, authorId);

        // TODO: test validations
    }
    
    /**
     * Add collection authors
     *
     * Associate new authors with the collection. This will add new authors to the list of already associated authors
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionAuthorsAddTest() throws ApiException {
        Long collectionId = null;
        AuthorsCreator authors = null;
        Location response = api.privateCollectionAuthorsAdd(collectionId, authors);

        // TODO: test validations
    }
    
    /**
     * List collection authors
     *
     * List collection authors
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionAuthorsListTest() throws ApiException {
        Long collectionId = null;
        List<Author> response = api.privateCollectionAuthorsList(collectionId);

        // TODO: test validations
    }
    
    /**
     * Replace collection authors
     *
     * Associate new authors with the collection. This will remove all already associated authors and add these new ones
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionAuthorsReplaceTest() throws ApiException {
        Long collectionId = null;
        AuthorsCreator authors = null;
        api.privateCollectionAuthorsReplace(collectionId, authors);

        // TODO: test validations
    }
    
    /**
     * Add collection categories
     *
     * Associate new categories with the collection. This will add new categories to the list of already associated categories
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionCategoriesAddTest() throws ApiException {
        Long collectionId = null;
        CategoriesCreator categories = null;
        Location response = api.privateCollectionCategoriesAdd(collectionId, categories);

        // TODO: test validations
    }
    
    /**
     * List collection categories
     *
     * List collection categories
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionCategoriesListTest() throws ApiException {
        Long collectionId = null;
        List<Category> response = api.privateCollectionCategoriesList(collectionId);

        // TODO: test validations
    }
    
    /**
     * Replace collection categories
     *
     * Associate new categories with the collection. This will remove all already associated categories and add these new ones
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionCategoriesReplaceTest() throws ApiException {
        Long collectionId = null;
        CategoriesCreator categories = null;
        api.privateCollectionCategoriesReplace(collectionId, categories);

        // TODO: test validations
    }
    
    /**
     * Delete collection category
     *
     * De-associate category from collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionCategoryDeleteTest() throws ApiException {
        Long collectionId = null;
        Long categoryId = null;
        api.privateCollectionCategoryDelete(collectionId, categoryId);

        // TODO: test validations
    }
    
    /**
     * Create collection
     *
     * Create a new Collection by sending collection information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionCreateTest() throws ApiException {
        CollectionCreate collection = null;
        LocationWarnings response = api.privateCollectionCreate(collection);

        // TODO: test validations
    }
    
    /**
     * Delete collection
     *
     * Delete n collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionDeleteTest() throws ApiException {
        Long collectionId = null;
        api.privateCollectionDelete(collectionId);

        // TODO: test validations
    }
    
    /**
     * Collection details
     *
     * View a collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionDetailsTest() throws ApiException {
        Long collectionId = null;
        CollectionCompletePrivate response = api.privateCollectionDetails(collectionId);

        // TODO: test validations
    }
    
    /**
     * Create collection private link
     *
     * Create new private link
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionPrivateLinkCreateTest() throws ApiException {
        Long collectionId = null;
        CollectionPrivateLinkCreator privateLink = null;
        PrivateLinkResponse response = api.privateCollectionPrivateLinkCreate(collectionId, privateLink);

        // TODO: test validations
    }
    
    /**
     * Disable private link
     *
     * Disable/delete private link for this collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionPrivateLinkDeleteTest() throws ApiException {
        Long collectionId = null;
        String linkId = null;
        api.privateCollectionPrivateLinkDelete(collectionId, linkId);

        // TODO: test validations
    }
    
    /**
     * Update collection private link
     *
     * Update existing private link for this collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionPrivateLinkUpdateTest() throws ApiException {
        Long collectionId = null;
        String linkId = null;
        CollectionPrivateLinkCreator privateLink = null;
        api.privateCollectionPrivateLinkUpdate(collectionId, linkId, privateLink);

        // TODO: test validations
    }
    
    /**
     * List collection private links
     *
     * List article private links
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionPrivateLinksListTest() throws ApiException {
        Long collectionId = null;
        List<PrivateLink> response = api.privateCollectionPrivateLinksList(collectionId);

        // TODO: test validations
    }
    
    /**
     * Private Collection Publish
     *
     * When a collection is published, a new public version will be generated. Any further updates to the collection will affect the private collection data. In order to make these changes publicly visible, an explicit publish operation is needed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionPublishTest() throws ApiException {
        Long collectionId = null;
        Location response = api.privateCollectionPublish(collectionId);

        // TODO: test validations
    }
    
    /**
     * Private Collection Reserve DOI
     *
     * Reserve DOI for collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionReserveDoiTest() throws ApiException {
        Long collectionId = null;
        CollectionDOI response = api.privateCollectionReserveDoi(collectionId);

        // TODO: test validations
    }
    
    /**
     * Private Collection Reserve Handle
     *
     * Reserve Handle for collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionReserveHandleTest() throws ApiException {
        Long collectionId = null;
        CollectionHandle response = api.privateCollectionReserveHandle(collectionId);

        // TODO: test validations
    }
    
    /**
     * Private Collection Resource
     *
     * Edit collection resource data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionResourceTest() throws ApiException {
        Long collectionId = null;
        Resource resource = null;
        Location response = api.privateCollectionResource(collectionId, resource);

        // TODO: test validations
    }
    
    /**
     * Update collection
     *
     * Update collection details; request can also be made with the PATCH method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionUpdateTest() throws ApiException {
        Long collectionId = null;
        CollectionUpdate collection = null;
        LocationWarningsUpdate response = api.privateCollectionUpdate(collectionId, collection);

        // TODO: test validations
    }
    
    /**
     * Private Collections List
     *
     * List private collections
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionsListTest() throws ApiException {
        Long page = null;
        Long pageSize = null;
        Long limit = null;
        Long offset = null;
        String order = null;
        String orderDirection = null;
        List<Collection> response = api.privateCollectionsList(page, pageSize, limit, offset, order, orderDirection);

        // TODO: test validations
    }
    
    /**
     * Private Collections Search
     *
     * Returns a list of private Collections
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void privateCollectionsSearchTest() throws ApiException {
        PrivateCollectionSearch search = null;
        List<Collection> response = api.privateCollectionsSearch(search);

        // TODO: test validations
    }
    
}