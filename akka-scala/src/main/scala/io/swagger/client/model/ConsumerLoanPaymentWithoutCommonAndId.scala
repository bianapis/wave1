/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class ConsumerLoanPaymentWithoutCommonAndId (
  /* `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  */
  paymentType: Option[String],
  /* `status: Registered` bian-reference:  Loan(asDebt).NextInterest.VariableInterest iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FXWRMsTGEeChad0JzLk7QA_-398781879/elements/_FXgCNMTGEeChad0JzLk7QA_-129916673)  */
  loanApplicableRate: Option[String],
  /* `status: Registered` bian-reference:  Loan.LoanAccount(asAccount).AccountPartyRole(asAccountOwnerRole) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EysE9cTGEeChad0JzLk7QA_-200588046) general-info: loan account holder  */
  customerReference: Option[String],
  /* `status: Registered` bian-reference:  Loan.InterestPaymentsSchedule.RelatedPaymentObligation.PaymentOffset.PartyRole(asDebtorRole) iso-link-1:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Etn-xcTGEeChad0JzLk7QA_1929472526) `status: Registered` bian-reference:  Loan.PrincipalPaymentsSchedule.RelatedPaymentObligation.PaymentOffset.PartyRole(asDebtorRole) iso-link-2:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Etn-xcTGEeChad0JzLk7QA_1929472526)  */
  payerReference: Option[String],
  /* `status: Registered` bian-reference:  Loan.InterestPaymentsSchedule.RelatedPaymentObligation.PaymentOffset.PartyRole(asDebtorRole)(asPaymentPartyRole).CashAccount iso-link-1:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EvtpdMTGEeChad0JzLk7QA_-1076538618/elements/_EvtpdsTGEeChad0JzLk7QA_1151666800) `status: Registered` bian-reference:  Loan.PrincipalPaymentsSchedule.RelatedPaymentObligation.PaymentOffset.PartyRole(asDebtorRole)(asPaymentPartyRole).CashAccount iso-link-2:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EvtpdMTGEeChad0JzLk7QA_-1076538618/elements/_EvtpdsTGEeChad0JzLk7QA_1151666800)  */
  payerProductInstanceReference: Option[String],
  /* `status: Registered` bian-reference:  Loan.InterestPaymentsSchedule.RelatedPaymentObligation.PaymentOffset.PartyRole(asDebtorRole).CashAccount(asAccount).AccountPartyRole(asAccountServicerRole) iso-link-1:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Ey118MTGEeChad0JzLk7QA_1536519000) `status: Registered` bian-reference:  Loan.PrincipalPaymentsSchedule.RelatedPaymentObligation.PaymentOffset.PartyRole(asDebtorRole).CashAccount(asAccount).AccountPartyRole(asAccountServicerRole) iso-link-2:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Ey118MTGEeChad0JzLk7QA_1536519000)  */
  payerBankReference: Option[String],
  amount: Option[CurrencyAndAmount],
  currency: Option[CurrencyCode],
  valueDate: Option[ISODateTime],
  /* `status: Registered` bian-reference:  Loan.InterestPaymentsSchedule.RelatedPaymentObligation.PaymentOffset iso-link-1:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FDPCYMTGEeChad0JzLk7QA_-1131921749/elements/_FDPCacTGEeChad0JzLk7QA_-72272631) `status: Registered` bian-reference:  Loan.PrincipalPaymentsSchedule.RelatedPaymentObligation.PaymentOffset iso-link-2:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FDPCYMTGEeChad0JzLk7QA_-1131921749/elements/_FDPCacTGEeChad0JzLk7QA_-72272631)  */
  stagedRepaymentStatement: Option[String],
  /* `status: Registered` bian-reference:  Loan.PrincipalAmount iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_mw1ysHJTEeWwf47VrwMaTQ/elements/_QLjLYHJUEeWwf47VrwMaTQ)  */
  loanOutstandingBalance: Option[Double]
) extends ApiModel

