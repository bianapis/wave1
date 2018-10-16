/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.ConsumerLoanDisbursementWithId
import io.swagger.client.model.ConsumerLoanMaintenanceWithId
import io.swagger.client.model.ConsumerLoanPaymentsWithId
import io.swagger.client.model.ConsumerLoanRestructuringWithId
import io.swagger.client.model.ConsumerLoanStatementWithId
import io.swagger.client.model.ConsumerLoanWithIdAndStatus
import io.swagger.client.model.ConsumerLoanWithdrawalWithId
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object RetrieveApi {

  /**
   * Retrieve Consumer Loan Disbursement Record
   * 
   * Expected answers:
   *   code 200 : ConsumerLoanDisbursementWithId (Successfully Retrieved Consumer Loan Disbursement Record)
   * 
   * @param crReferenceId Product Instance Reference (loan account number)
   * @param bqReferenceId Disbursement Order Reference
   */
  def retrieve Disbursement(crReferenceId: String, bqReferenceId: String): ApiRequest[ConsumerLoanDisbursementWithId] =
    ApiRequest[ConsumerLoanDisbursementWithId](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-consumer-loan/3.0.1", "/consumer-loan/consumer-loan-fulfillment-arrangement/{cr-reference-id}/disbursements/{bq-reference-id}", "application/json")
      .withPathParam("cr-reference-id", crReferenceId)
      .withPathParam("bq-reference-id", bqReferenceId)
      .withSuccessResponse[ConsumerLoanDisbursementWithId](200)
        /**
   * Retrieve Consumer Loan Maintenance Record
   * 
   * Expected answers:
   *   code 200 : ConsumerLoanMaintenanceWithId (Successfully Retrieved Consumer Loan Maintenance Record)
   * 
   * @param crReferenceId Product Instance Reference (loan account number)
   * @param bqReferenceId Product Fulfillment Schedule
   */
  def retrieve Maintenance(crReferenceId: String, bqReferenceId: String): ApiRequest[ConsumerLoanMaintenanceWithId] =
    ApiRequest[ConsumerLoanMaintenanceWithId](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-consumer-loan/3.0.1", "/consumer-loan/consumer-loan-fulfillment-arrangement/{cr-reference-id}/maintenances/{bq-reference-id}", "application/json")
      .withPathParam("cr-reference-id", crReferenceId)
      .withPathParam("bq-reference-id", bqReferenceId)
      .withSuccessResponse[ConsumerLoanMaintenanceWithId](200)
        /**
   * Retrieved Consumer Loan Payment Record
   * 
   * Expected answers:
   *   code 200 : ConsumerLoanPaymentsWithId (Successfully Retrieved Consumer Loan Payment Record)
   * 
   * @param crReferenceId Product Instance Reference (loan account number)
   * @param bqReferenceId Payment Transaction Reference
   */
  def retrieve Payment(crReferenceId: String, bqReferenceId: String): ApiRequest[ConsumerLoanPaymentsWithId] =
    ApiRequest[ConsumerLoanPaymentsWithId](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-consumer-loan/3.0.1", "/consumer-loan/consumer-loan-fulfillment-arrangement/{cr-reference-id}/payments/{bq-reference-id}", "application/json")
      .withPathParam("cr-reference-id", crReferenceId)
      .withPathParam("bq-reference-id", bqReferenceId)
      .withSuccessResponse[ConsumerLoanPaymentsWithId](200)
        /**
   * Retrieve Consumer Loan Restructurings Record
   * 
   * Expected answers:
   *   code 200 : ConsumerLoanRestructuringWithId (Successfully Retrieved Consumer Loan Restructurings Record)
   * 
   * @param crReferenceId Product Instance Reference (loan account number)
   * @param bqReferenceId Restructuring Task Reference
   */
  def retrieve Restructuring(crReferenceId: String, bqReferenceId: String): ApiRequest[ConsumerLoanRestructuringWithId] =
    ApiRequest[ConsumerLoanRestructuringWithId](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-consumer-loan/3.0.1", "/consumer-loan/consumer-loan-fulfillment-arrangement/{cr-reference-id}/restructurings/{bq-reference-id}", "application/json")
      .withPathParam("cr-reference-id", crReferenceId)
      .withPathParam("bq-reference-id", bqReferenceId)
      .withSuccessResponse[ConsumerLoanRestructuringWithId](200)
        /**
   * Retrieved Consumer Loan Statement
   * 
   * Expected answers:
   *   code 200 : ConsumerLoanStatementWithId (Successfully Retrieved Consumer Loan Statement Record)
   * 
   * @param crReferenceId Product Instance Reference (loan account number)
   * @param bqReferenceId Statement Instance Reference
   */
  def retrieve Statements(crReferenceId: String, bqReferenceId: String): ApiRequest[ConsumerLoanStatementWithId] =
    ApiRequest[ConsumerLoanStatementWithId](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-consumer-loan/3.0.1", "/consumer-loan/consumer-loan-fulfillment-arrangement/{cr-reference-id}/statements/{bq-reference-id}", "application/json")
      .withPathParam("cr-reference-id", crReferenceId)
      .withPathParam("bq-reference-id", bqReferenceId)
      .withSuccessResponse[ConsumerLoanStatementWithId](200)
        /**
   * Retrieve Consumer Loan Wthdrawl Record
   * 
   * Expected answers:
   *   code 200 : ConsumerLoanWithdrawalWithId (Successfully Retrieved Consumer Loan Withdrawl Record)
   * 
   * @param crReferenceId Product Instance Reference (loan account number)
   * @param bqReferenceId Withdrawal Instruction Reference
   */
  def retrieve Withdrawal(crReferenceId: String, bqReferenceId: String): ApiRequest[ConsumerLoanWithdrawalWithId] =
    ApiRequest[ConsumerLoanWithdrawalWithId](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-consumer-loan/3.0.1", "/consumer-loan/consumer-loan-fulfillment-arrangement/{cr-reference-id}/withdrawals/{bq-reference-id}", "application/json")
      .withPathParam("cr-reference-id", crReferenceId)
      .withPathParam("bq-reference-id", bqReferenceId)
      .withSuccessResponse[ConsumerLoanWithdrawalWithId](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[String] (successful)
   * 
   * @param crReferenceId Product Instance Reference
   * @param behaviorQualifier Behavior Qualifier Name. ex- payment
   * @param collectionFilter Filter to refine the result set. ex- \&quot;customerReference &#x3D;&#x3D; &#39;CR77745&#39;\&quot;
   */
  def retrieveBehaviorQualifierReferenceIds(crReferenceId: String, behaviorQualifier: String, collectionFilter: Option[String] = None): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-consumer-loan/3.0.1", "/consumer-loan/consumer-loan-fulfillment-arrangement/{cr-reference-id}/{behavior-qualifier}/", "application/json")
      .withQueryParam("collection-filter", collectionFilter)
      .withPathParam("cr-reference-id", crReferenceId)
      .withPathParam("behavior-qualifier", behaviorQualifier)
      .withSuccessResponse[Seq[String]](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[String] (successful)
   */
  def retrieveConsumerLoanBehaviorQualifiers(): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-consumer-loan/3.0.1", "/consumer-loan/consumer-loan-fulfillment-arrangement/behavior-qualifiers/", "application/json")
      .withSuccessResponse[Seq[String]](200)
        /**
   * retrieveConsumerLoanFulfillmentArrangement Service Operation
   * 
   * Expected answers:
   *   code 200 : ConsumerLoanWithIdAndStatus (Retrieved consumer loan reporting)
   * 
   * @param crReferenceId Product Instance Reference (loan account number)
   */
  def retrieveConsumerLoanFulfillmentArrangementWithBQs(crReferenceId: String): ApiRequest[ConsumerLoanWithIdAndStatus] =
    ApiRequest[ConsumerLoanWithIdAndStatus](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-consumer-loan/3.0.1", "/consumer-loan/consumer-loan-fulfillment-arrangement/{cr-reference-id}", "application/json")
      .withPathParam("cr-reference-id", crReferenceId)
      .withSuccessResponse[ConsumerLoanWithIdAndStatus](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[String] (successful)
   * 
   * @param collectionFilter Filter to refine the result set. ex- &#39;customer-reference-id &#x3D; CR123&#39;
   */
  def retrieveConsumerLoanReferenceIds(collectionFilter: Option[String] = None): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, "https://virtserver.swaggerhub.com/BIAN/sd-consumer-loan/3.0.1", "/consumer-loan/consumer-loan-fulfillment-arrangement/", "application/json")
      .withQueryParam("collection-filter", collectionFilter)
      .withSuccessResponse[Seq[String]](200)
      

}

