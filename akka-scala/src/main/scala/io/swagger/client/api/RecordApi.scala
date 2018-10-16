/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.ConsumerLoanRecordRequest
import io.swagger.client.model.ConsumerLoanRecordResponse
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object RecordApi {

  /**
   * Record activity/feedback against an active consumer loan
   * 
   * Expected answers:
   *   code 201 : ConsumerLoanRecordResponse (A new record is created)
   * 
   * @param crReferenceId Product Instance Reference (loan account number)
   * @param body 
   */
  def recordConsumerLoanFulfillmentArrangement(crReferenceId: String, body: Option[ConsumerLoanRecordRequest] = None): ApiRequest[ConsumerLoanRecordResponse] =
    ApiRequest[ConsumerLoanRecordResponse](ApiMethods.POST, "https://virtserver.swaggerhub.com/BIAN/sd-consumer-loan/3.0.1", "/consumer-loan/consumer-loan-fulfillment-arrangement/{cr-reference-id}/recording", "application/json")
      .withBody(body)
      .withPathParam("cr-reference-id", crReferenceId)
      .withSuccessResponse[ConsumerLoanRecordResponse](201)
      

}

