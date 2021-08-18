/*
 * Turnitin Core API
 * Turnitin Core API (TCA) provides direct API access to the core functionality provided by Turnitin. It supports file submission, similarity report generation, group management, and visualization of report matches via Cloud Viewer or PDF download. Below is the full flow to successfully set up an integration scope, an API Key, and make calls to TCA. Integration Scope and API Key management is done via the Admin Console UI, by logging in as an admin user. For more details, go to our [developer portal documentation page](https://developers.turnitin.com/docs). ## Integration Scope and API Key Management TCA API calls must provide an API Key for authentication, so you must first have at least one integration scope associated with at least one API Key to use TCA. ### Admin Console UI First, login to Admin Console UI as an *Admin* user with permission to create Integration Scopes, under a tenant that is licensed to use the TCA product Integration Scopes (you can create a new one, or add keys to existing)    * Click `Integrations` in the side bar --> `+ Add Integration` at top the top of the page --> Enter a name --> `Add` Button   API Keys   * Click `Integrations` in the side bar --> `Create API Key` Button next to a given Integration Scope -->   Enter a name --> click `Create and View button`   * Copy/Save the key manually or click save to clipboard button to copy it (this is the only time it will show)  ## TCA Flow    *  Register a webhook   *  Create a submission   *  Upload a file to the submission   *  Wait for the submission upload to process      * If you registered a webhook, a callback will be sent to it when upload is complete      * The status of the *submission* will also update to `COMPLETE`   *  Request a Similarity Report   *  Wait for similarity report to process      * If you registered a webhook, a callback will be sent to it when report is complete      * The status of the *report* will also be updated to `COMPLETE`   *  Request a URL with parameters to view the Similarity Report 
 *
 * The version of the OpenAPI document: 1.0.220
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Error;
import java.io.File;
import org.openapitools.client.model.PdfStatusResponse;
import org.openapitools.client.model.RateLimitError;
import org.openapitools.client.model.RequestPdfResponse;
import org.openapitools.client.model.SimilarityMetadata;
import org.openapitools.client.model.SimilarityPutRequest;
import org.openapitools.client.model.SimilarityViewerUrlResponse;
import org.openapitools.client.model.SimilarityViewerUrlSettings;
import org.openapitools.client.model.SuccessMessage;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SimilarityApi
 */
@Ignore
public class SimilarityApiTest {

    private final SimilarityApi api = new SimilarityApi();

    
    /**
     * GET download pdf
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadSimilarityReportPdfTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String id = null;
        String pdfId = null;
        File response = api.downloadSimilarityReportPdf(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, pdfId);

        // TODO: test validations
    }
    
    /**
     * GET pdf download status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSimilarityReportPdfStatusTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String id = null;
        String pdfId = null;
        PdfStatusResponse response = api.getSimilarityReportPdfStatus(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, pdfId);

        // TODO: test validations
    }
    
    /**
     * Get Similarity Report Results
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSimilarityReportResultsTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String id = null;
        SimilarityMetadata response = api.getSimilarityReportResults(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id);

        // TODO: test validations
    }
    
    /**
     * Returns a URL to access Cloud Viewer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSimilarityReportUrlTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String id = null;
        SimilarityViewerUrlSettings data = null;
        SimilarityViewerUrlResponse response = api.getSimilarityReportUrl(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, data);

        // TODO: test validations
    }
    
    /**
     * Request Similarity Report generation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestSimilarityReportTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String id = null;
        SimilarityPutRequest data = null;
        SuccessMessage response = api.requestSimilarityReport(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, data);

        // TODO: test validations
    }
    
    /**
     * Request Pdf download and returns the Pdf Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestSimilarityReportPdfTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String id = null;
        RequestPdfResponse response = api.requestSimilarityReportPdf(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id);

        // TODO: test validations
    }
    
}
