/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.ConsumerLoanBase
import io.swagger.client.model.ConsumerLoanWithIdAndStatus
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object UpdateApi {

  /**
   * Update an Active Consumer Loan
   * 
   * Expected answers:
   *   code 200 : ConsumerLoanWithIdAndStatus (Successfully Updated Active Consumer Loan)
   * 
   * @param crReferenceId Product Instance Reference (loan account number)
   * @param body Update control record request payload
   */
  def updateConsumerLoanFulfillmentArrangement(crReferenceId: String, body: ConsumerLoanBase): ApiRequest[ConsumerLoanWithIdAndStatus] =
    ApiRequest[ConsumerLoanWithIdAndStatus](ApiMethods.PUT, "https://virtserver.swaggerhub.com/BIAN/sd-consumer-loan/3.0.1", "/consumer-loan/consumer-loan-fulfillment-arrangement/{cr-reference-id}/updation", "application/json")
      .withBody(body)
      .withPathParam("cr-reference-id", crReferenceId)
      .withSuccessResponse[ConsumerLoanWithIdAndStatus](200)
      

}

