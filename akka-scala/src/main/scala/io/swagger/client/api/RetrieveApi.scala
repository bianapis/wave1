/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.BankRelationsBaseWithIdAndRoot
import io.swagger.client.model.CustomerAssociationBaseWithIdAndRoot
import io.swagger.client.model.DemographicBaseWithIdAndRoot
import io.swagger.client.model.ReferenceBaseWithIdAndRoot
import io.swagger.client.model.RetrieveCustomerReferenceDataManagementRoot
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object RetrieveApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[String] (successful)
   * 
   * @param crReferenceId Customer Reference Data Management Directory Entry Reference
   * @param behaviorQualifier Behavior Qualifier Name. ex- bankrelations
   * @param collectionFilter Filter to refine the result set. ex- \&quot;&#39;bankRelationType &#x3D;&#x3D; RM&#39;\&quot;
   */
  def retrieveBehaviorQualifierReferenceIds(crReferenceId: String, behaviorQualifier: String, collectionFilter: Option[String] = None): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-customer-reference-data-management/4.0.0", "/customer-reference-data-management/customer-reference-data-directory/{cr-reference-id}/{behavior-qualifier}/", "application/json")
      .withQueryParam("collection-filter", collectionFilter)
      .withPathParam("cr-reference-id", crReferenceId)
      .withPathParam("behavior-qualifier", behaviorQualifier)
      .withSuccessResponse[Seq[String]](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : RetrieveCustomerReferenceDataManagementRoot (Successfully retrieved Customer Reference Data Directory.)
   * 
   * @param crReferenceId Customer Reference Data Management Directory Entry Reference
   */
  def retrieveCustomerReferenceDataDirectory(crReferenceId: String): ApiRequest[RetrieveCustomerReferenceDataManagementRoot] =
    ApiRequest[RetrieveCustomerReferenceDataManagementRoot](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-customer-reference-data-management/4.0.0", "/customer-reference-data-management/customer-reference-data-directory/{cr-reference-id}", "application/json")
      .withPathParam("cr-reference-id", crReferenceId)
      .withSuccessResponse[RetrieveCustomerReferenceDataManagementRoot](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : CustomerAssociationBaseWithIdAndRoot (Successfully retrieved customer reference data directory associates.)
   * 
   * @param crReferenceId Customer Reference Data Directory Entry Reference
   * @param bqReferenceId Associations Directory Entry Reference
   */
  def retrieveCustomerReferenceDataDirectoryAssociates(crReferenceId: String, bqReferenceId: String): ApiRequest[CustomerAssociationBaseWithIdAndRoot] =
    ApiRequest[CustomerAssociationBaseWithIdAndRoot](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-customer-reference-data-management/4.0.0", "/customer-reference-data-management/customer-reference-data-directory/{cr-reference-id}/associations/{bq-reference-id}", "application/json")
      .withPathParam("cr-reference-id", crReferenceId)
      .withPathParam("bq-reference-id", bqReferenceId)
      .withSuccessResponse[CustomerAssociationBaseWithIdAndRoot](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : BankRelationsBaseWithIdAndRoot (Successfully retrieved customer reference data directory bank relations.)
   * 
   * @param crReferenceId Customer Reference Data Directory Entry Reference
   * @param bqReferenceId Bank Relations Directory Entry Reference
   */
  def retrieveCustomerReferenceDataDirectoryBankRelations(crReferenceId: String, bqReferenceId: String): ApiRequest[BankRelationsBaseWithIdAndRoot] =
    ApiRequest[BankRelationsBaseWithIdAndRoot](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-customer-reference-data-management/4.0.0", "/customer-reference-data-management/customer-reference-data-directory/{cr-reference-id}/bankrelations/{bq-reference-id}", "application/json")
      .withPathParam("cr-reference-id", crReferenceId)
      .withPathParam("bq-reference-id", bqReferenceId)
      .withSuccessResponse[BankRelationsBaseWithIdAndRoot](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : DemographicBaseWithIdAndRoot (Successfully retrieved customer reference data directory demographics.)
   * 
   * @param crReferenceId Customer Reference Data Directory Entry Reference
   * @param bqReferenceId Demographics Directory Entry Reference
   */
  def retrieveCustomerReferenceDataDirectoryDemographics(crReferenceId: String, bqReferenceId: String): ApiRequest[DemographicBaseWithIdAndRoot] =
    ApiRequest[DemographicBaseWithIdAndRoot](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-customer-reference-data-management/4.0.0", "/customer-reference-data-management/customer-reference-data-directory/{cr-reference-id}/demographics/{bq-reference-id}", "application/json")
      .withPathParam("cr-reference-id", crReferenceId)
      .withPathParam("bq-reference-id", bqReferenceId)
      .withSuccessResponse[DemographicBaseWithIdAndRoot](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : ReferenceBaseWithIdAndRoot (Successfully retrieved Customer Reference Data Directory References.)
   * 
   * @param crReferenceId Customer Reference Data Directory Entry Reference
   * @param bqReferenceId Reference Directory Entry Reference
   */
  def retrieveCustomerReferenceDataDirectoryReferences(crReferenceId: String, bqReferenceId: String): ApiRequest[ReferenceBaseWithIdAndRoot] =
    ApiRequest[ReferenceBaseWithIdAndRoot](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-customer-reference-data-management/4.0.0", "/customer-reference-data-management/customer-reference-data-directory/{cr-reference-id}/references/{bq-reference-id}/", "application/json")
      .withPathParam("cr-reference-id", crReferenceId)
      .withPathParam("bq-reference-id", bqReferenceId)
      .withSuccessResponse[ReferenceBaseWithIdAndRoot](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[String] (successful)
   */
  def retrieveCustomerReferenceDataManagementBehaviorQualifiers(): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-customer-reference-data-management/4.0.0", "/customer-reference-data-management/customer-reference-data-directory/behavior-qualifiers/", "application/json")
      .withSuccessResponse[Seq[String]](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[String] (successful)
   * 
   * @param collectionFilter Filter to refine the result set. ex- \&quot;customer-reference&#x3D;&#x3D; &#39;CR123&#39;\&quot;
   */
  def retrieveCustomerReferenceManagementReferenceIds(collectionFilter: Option[String] = None): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-customer-reference-data-management/4.0.0", "/customer-reference-data-management/customer-reference-data-directory/", "application/json")
      .withQueryParam("collection-filter", collectionFilter)
      .withSuccessResponse[Seq[String]](200)
      

}

