/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.ReferenceBaseUpdateRequest
import io.swagger.client.model.ReferenceBaseWithIdAndRoot
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object UpdateApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : ReferenceBaseWithIdAndRoot (Successfully)
   * 
   * @param crReferenceId Customer Reference Data Directory Entry Reference
   * @param body Update control record request payload
   */
  def updateCustomerReferenceDataDirectory(crReferenceId: String, body: ReferenceBaseUpdateRequest): ApiRequest[ReferenceBaseWithIdAndRoot] =
    ApiRequest[ReferenceBaseWithIdAndRoot](ApiMethods.PUT, "https://virtserver.swaggerhub.com/BIAN/sd-customer-reference-data-management/4.0.0", "/customer-reference-data-management/customer-reference-data-directory/{cr-reference-id}/updation", "application/json")
      .withBody(body)
      .withPathParam("cr-reference-id", crReferenceId)
      .withSuccessResponse[ReferenceBaseWithIdAndRoot](200)
      

}

