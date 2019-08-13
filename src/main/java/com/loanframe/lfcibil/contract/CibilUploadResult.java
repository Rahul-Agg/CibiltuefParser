package com.loanframe.lfcibil.contract;
/*
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jongo.marshall.jackson.oid.MongoObjectId;
*/

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Anshu Goyal on 22/05/2018.
 */

public class CibilUploadResult {

    //    public String loanId;
//    public String pan;
    public String name;
    //  private LatePayment latePayment;
//    private Integer personalLoanScore;
//    private Map <String, Integer> types;
//    private Integer numberOfLoansActive;
//    private Integer numberOfLoansClosed;
//    private Integer numberOfLoansApplied;
//    private Integer numberOfLoansApproved;
//    private Integer numberOfOverdueAccount;
//    private Integer totalNumberOfLatePayment;
//    private Integer numberOfCreditCardApplied;
//    private Integer numberOfCreditCardApproved;
//    private List<CreditCardList> creditCardList;
//    private Integer totalNumberOfCreditCardActive;
//    private Integer totalNumberOfCreditCardClosed;
//    private Integer numberOfLatePaymentOfCreditCard;
//    private List <AccountAnalysisList> accountAnalysisList;
//    private List <String> overdueLoans = new ArrayList <> ();
//    private Integer numberOfLatePaymentOfCreditCardLastSixMonth;
    //    private String message;
    //    private Boolean status;
    public String enquiryDate;
    private String gender;
    private String memberId;
    private String dateOfBirth;
    private String controlNumber;
    private String enquiryTime;
    //public String cibilIdentifier;
    private String memberRefNumber;
    private Integer responseLength;
    private Integer score;
    private String scoreName;
    private AccountSummary accountSummary;
    private List<ContactInformationList> addressSegmentList;
    private List<EmailAddressList> emailAddressList;
    private List<PhoneNumberList> phoneNumberList;
    private List<AccountInformationList> accountInformationList;
    private List<EnquiryInformationList> enquirySegmentsList;
    private List<ResponseNameSegment> nameSegmentList;
    private List<IdentificationList> identificationSegmentList;
    private List<EmploymentInformationList> employmentSegmentList;
    private List<ResponseAccountNumber> accountNumbersList;

    public static void main(String [] args)
    {
        CibilUploadResult cur = new CibilUploadResult();
        cur.tuefResponsetData("TUEF12201908131037013381851      0000NB70061001_UATC2C             100215070593213082019103902PN03N010104DASS0209MOHAN DAS0301P0512MOHAN DASS P07081306197808012ID03I010102010210AUJPS2524C9001YID03I020102020208J12393499001YPT03T01011098947089180302019001YPT03T02011084088172630302019001YPT03T0301100989478918030200PT03T040108471300000203222030203SC10CIBILTUSCR0102010202100308130820190405000-1PA03A010120LGXOTXOYCO OTXOYCOYC0507CHENNAI06023307066000290802020902021008150620179001YPA03A020130ZXCZXC HGJGJGJG ZXCZXC CHENNAI0602330706601302080204100811072013PA03A030135NO:1 RAJESH NAGAR EXTN NEHRU STREET0234MB:989478918 NARAYANAPURAM CHENNAI0602330706601301080204100804072013PA03A040124ABCDEFG & IJKLLE HYGIENE0219PLOT NO-173,314,3150319KUNDAIM INDL ESTATE0407KUNDAIM0602270706403115080203100821022013TL04T0010213NOT DISCLOSED0402100501108083105200709083012200811081902201212049873130498731404956028549009009009009009009009009009009009009009009009009009002954900887857826796765737706675645614584553522492XXX431400300801022012310801032009IQ04I0010108080820190409MONEYWISE05020506077500000IQ04I0020108101020180413NOT DISCLOSED0502000606500000IQ04I0030108170520180413NOT DISCLOSED0502010606105848IQ04I0040108030520180413NOT DISCLOSED0502010606900000IQ04I0050108030520180413NOT DISCLOSED0502010606900000IQ04I0060108130420180413NOT DISCLOSED0502010606900000IQ04I0070108050420180413NOT DISCLOSED0502010606900000IQ04I0080108050420180413NOT DISCLOSED0502010606900000IQ04I0090108050420180413NOT DISCLOSED0502010606900000IQ04I0100108040420180413NOT DISCLOSED0502010606900000IQ04I0110108220320180413NOT DISCLOSED050213060545000IQ04I0120108200320180413NOT DISCLOSED050213060545000IQ04I0130108190320180413NOT DISCLOSED050206060545000IQ04I0140108190320180413NOT DISCLOSED050206060545000IQ04I0150108120320180413NOT DISCLOSED050201060545000IQ04I0160108100320180413NOT DISCLOSED0502000606100001IQ04I0170108070320180413NOT DISCLOSED0502000606100001IQ04I0180108070320180413NOT DISCLOSED0502000606100001IQ04I0190108050320180413NOT DISCLOSED0502000606100001IQ04I0200108010320180413NOT DISCLOSED0502000606100001IQ04I0210108150620170413NOT DISCLOSED050251060510000IQ04I0220108270420170413NOT DISCLOSED050200060512000IQ04I0230108270420170413NOT DISCLOSED050200060512000IQ04I0240108260420170413NOT DISCLOSED05020006041000IQ04I0250108240420170413NOT DISCLOSED050200060512000IQ04I0260108200420170413NOT DISCLOSED050205060512000IQ04I0270108111020130413NOT DISCLOSED05021006041000IQ04I0280108091020130413NOT DISCLOSED05021006041000IQ04I0290108270920130413NOT DISCLOSED05020006043000IQ04I0300108250920130413NOT DISCLOSED05020606042500IQ04I0310108120720130413NOT DISCLOSED0502010603600IQ04I0320108110720130413NOT DISCLOSED0502130606100000IQ04I0330108080720130413NOT DISCLOSED0502010603600IQ04I0340108080720130413NOT DISCLOSED050210060550000IQ04I0350108080720130413NOT DISCLOSED050205060520000IQ04I0360108040720130413NOT DISCLOSED0502010603200IQ04I0370108300520130413NOT DISCLOSED05020106071000000IQ04I0380108280520130413NOT DISCLOSED05021006041000IQ04I0390108300420130413NOT DISCLOSED05020106071000000IQ04I0400108270420130413NOT DISCLOSED05020106071000000IQ04I0410108230320130413NOT DISCLOSED05021006041000IQ04I0420108210320130413NOT DISCLOSED05021006041000IQ04I0430108190320130413NOT DISCLOSED05021006041000IQ04I0440108160320130413NOT DISCLOSED05021006041000IQ04I0450108150320130413NOT DISCLOSED05021006041000IQ04I0460108140320130413NOT DISCLOSED05021006041000IQ04I0470108130320130413NOT DISCLOSED05021006041000IQ04I0480108120320130413NOT DISCLOSED05021006041000IQ04I0490108080320130413NOT DISCLOSED05021006041000IQ04I0500108010320130413NOT DISCLOSED05021006041000IQ04I0510108210220130413NOT DISCLOSED05021006041000IQ04I0520108150220130413NOT DISCLOSED05020006011IQ04I0530108280120130413NOT DISCLOSED05020106041234IQ04I0540108050420120413NOT DISCLOSED050210060550000IQ04I0550108030420120413NOT DISCLOSED050210060550000IQ04I0560108310320120413NOT DISCLOSED050210060550000IQ04I0570108310720070413NOT DISCLOSED050210060550000IQ04I0580108220520070413NOT DISCLOSED0502100606100000IQ04I0590108080520070413NOT DISCLOSED0502050606100000ES0700041120102**");
    }
    public CibilUploadResult tuefResponsetData(String tuefResponseString)
    {
        CibilUploadResult cibil = new CibilUploadResult();

        System.out.println("=======================================PhoneNumber List===========================================");
        PhoneNumberList phone = new PhoneNumberList();
        cibil.setPhoneNumberList(phone.parseNumuber(tuefResponseString));
        Iterator itr = cibil.getPhoneNumberList().iterator();
        while (itr.hasNext())
        {
            PhoneNumberList pnl = (PhoneNumberList)itr.next();
            System.out.println(pnl.getNumber()+"  "+pnl.getExtension()+"  "+pnl.getType());
            System.out.println();
        }
        System.out.println("====================================AccountInformationList=============================================");
        /*
        AccountInformationList account = new AccountInformationList();
        try {
            cibil.setAccountInformationList(account.parseAccountInformation(tuefResponseString));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        List lll = getAccountInformationList();
        System.out.println(lll.size());
        itr = lll.iterator();
        while(itr.hasNext())
        {
            AccountInformationList ail = (AccountInformationList)itr.next();
            System.out.println(ail.getAmountOverdue());
            System.out.println(ail.getCurrentBalance());
            System.out.println(ail.getDateOpened());
            System.out.println(ail.getPaymentHistory());
            System.out.println(ail.getPaymentStartDate());
            System.out.println(ail.getSanctionedAmount());
            System.out.println(ail.getTotalAccounts());
            System.out.println(ail.getAccountNumber());
            System.out.println(ail.getAccountType());
            System.out.println(ail.getActualPaymentAmount());
            System.out.println(ail.getAssetList());
            System.out.println(ail.getBank());
            System.out.println(ail.getCashLimit());
            System.out.println(ail.getCibilRemarks());
            System.out.println(ail.getCreditLimit());
            System.out.println(ail.getDateClosed());
            System.out.println(ail.getDateDisputeReamrks());
            System.out.println(ail.getDateErrorCode());
            System.out.println(ail.getDateOfEntryCibilRemarks());
            System.out.println(ail.getDateOfLastPayment());
            System.out.println(ail.getDateReported());
            System.out.println(ail.getDisputeRemarks1());
            System.out.println(ail.getDisputeRemarks2());
            System.out.println(ail.getEmiAmount());
            System.out.println(ail.getErrorCode());
            System.out.println(ail.getHighCredit());
            System.out.println(ail.getMemberName());
            System.out.println(ail.getOwnership());
            System.out.println(ail.getPaymentEndDate());
            System.out.println(ail.getPaymentFrequency());
            System.out.println(ail.getRateOfInterest());
            System.out.println(ail.getRepaymentTenure());
            System.out.println(ail.getSettledStatus());
            System.out.println(ail.getSettlement());
            System.out.println(ail.getSuitFiled());
            System.out.println(ail.getTypeOfCollateral());
            System.out.println(ail.getValueOfCollateral());
            System.out.println(ail.getWrittenOffPrincipal());
            System.out.println(ail.getWrittenOffTotal());
        }
        cibil.setAccountSummary(new AccountSummary().sendToAccountSummary(cibil.getAccountInformationList()));
*/
        System.out.println("=============================Address Details=====================================================");
        ContactInformationList addressSegment = new ContactInformationList();
        cibil.setAddressSegmentList(addressSegment.addressInformation(tuefResponseString));
        itr = cibil.getAddressSegmentList().iterator();
        while(itr.hasNext())
        {
            ContactInformationList cll = (ContactInformationList)itr.next();
            System.out.println(cll.getAddress());
            System.out.println(cll.getStateCode());
            System.out.println(cll.getPin());
            System.out.println(cll.getCategory());
            System.out.println(cll.getResidenceCode());
            System.out.println(cll.getDateReported());
            System.out.println(cll.getMemberSName());
            System.out.println();
        }

        System.out.println("======================================Email Delails==============================================");
        EmailAddressList emailAddress = new EmailAddressList();
        cibil.setEmailAddressList(emailAddress.emaliInformation(tuefResponseString));
        itr = cibil.getEmailAddressList().iterator();
        while(itr.hasNext())
        {
            EmailAddressList eal = (EmailAddressList)itr.next();
            System.out.println(eal.getEmailAddress());
        }

        System.out.println("=========================Enquiry Segment===========================================================");
        EnquiryInformationList enquirySegment = new EnquiryInformationList();
        cibil.setEnquirySegmentsList(enquirySegment.enquiryInformation(tuefResponseString));
        itr = cibil.getEnquirySegmentsList().iterator();
        while(itr.hasNext())
        {
            EnquiryInformationList eil = (EnquiryInformationList)itr.next();
            System.out.println(eil.getDateOfEnquiry());
            System.out.println(eil.getMemberName());
            System.out.println(eil.getEnquiryPurpose());
            System.out.println(eil.getEnquiryAmount());
            System.out.println();
        }

        System.out.println("===========================================Score Segment===========================================");
        ResponseScoreSegment scoreSegment = new ResponseScoreSegment();
        List<ResponseScoreSegment> list = scoreSegment.scoreDetails(tuefResponseString);
         itr = list.iterator();
        while (itr.hasNext()) {
            ResponseScoreSegment score = (ResponseScoreSegment) itr.next();
            cibil.setScoreName(score.getScoreName());
            cibil.setScore(score.getScore());
        }
        System.out.println(cibil.getScoreName());
        System.out.println(cibil.getScore());

        System.out.println("=============================Name Segment==========================================================");
        ResponseNameSegment responseNameSegment = new ResponseNameSegment();
        responseNameSegment = responseNameSegment.nameDetails(tuefResponseString);
        cibil.setName(responseNameSegment.getName());
        cibil.setGender(responseNameSegment.getGender());
        cibil.setDateOfBirth(responseNameSegment.getDateOfBirth());
        System.out.println(cibil.getName());
        System.out.println(cibil.getGender());
        System.out.println(cibil.getDateOfBirth());

        System.out.println("======================Identification Segment=====================================================");
        IdentificationList identificationList = new IdentificationList();
        cibil.setIdentificationSegmentList(identificationList.identificationInformation(tuefResponseString));
        itr = cibil.getIdentificationSegmentList().iterator();
        while(itr.hasNext())
        {
            IdentificationList il = (IdentificationList)itr.next();
            System.out.println(il.getIDtype());
            System.out.println(il.getIDnumber());
            System.out.println(il.getIssueDate());
            System.out.println(il.getExpiryDate());
            System.out.println();
        }

        EmploymentInformationList employmentInformationList = new EmploymentInformationList();
        try {
            cibil.setEmploymentSegmentList(employmentInformationList.employmentDetails(tuefResponseString));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        itr = cibil.getEmploymentSegmentList().iterator();
        while (itr.hasNext())
        {
            EmploymentInformationList eil = (EmploymentInformationList)itr.next();
            System.out.println(eil.getAccountType());
            System.out.println(eil.getDateReported());
            System.out.println(eil.getOccupation());
            System.out.println(eil.getIncome());
            System.out.println(eil.getNetGrossIncomeIndicator());
            System.out.println(eil.getMonthlyAnnualIncomeIndiactor());
            System.out.println(eil.getDateOfErrorCode());
            System.out.println(eil.getErrorcode());
            System.out.println(eil.getDateOfcibilremarks());
            System.out.println(eil.getCibilRemarksCode());
            System.out.println(eil.getDateOfDisputeRemarks());
            System.out.println(eil.getDisputeRemarksCode());
        }

        ResponseAccountNumber responseAccountNumber = new ResponseAccountNumber();
        cibil.setAccountNumbersList(responseAccountNumber.enquiryAccountNumber(tuefResponseString));
        itr = cibil.getAccountNumbersList().iterator();
        while(itr.hasNext())
        {
            ResponseAccountNumber ran = (ResponseAccountNumber)itr.next();
            System.out.println(ran.getResponseAccountNumber());
            System.out.println();

        }
        ResponseTuef responseTuef = new ResponseTuef();
        responseTuef = responseTuef.setResponseTuef(tuefResponseString);
        cibil.setMemberId(responseTuef.getMemberId());
        cibil.setMemberRefNumber(responseTuef.getMemberRefNumber());
        cibil.setControlNumber(responseTuef.getControlNumber());
        cibil.setEnquiryDate(responseTuef.getEnquiryDate());
        cibil.setEnquiryTime(responseTuef.getEnquiryTime());

        ResponseEndSegment responseEndSegment = new ResponseEndSegment();
        cibil.setResponseLength(responseEndSegment.responselength(tuefResponseString));
        return cibil;
    }

    public AccountSummary getAccountSummary() {
        return accountSummary;
    }

    public void setAccountSummary(AccountSummary accountSummary) {
        this.accountSummary = accountSummary;
    }

    public String getEnquiryDate() {
        return enquiryDate;
    }

    public void setEnquiryDate(String enquiryDate) {
        this.enquiryDate = enquiryDate;
    }

    public String getEnquiryTime() {
        return enquiryTime;
    }

    public void setEnquiryTime(String enquiryTime) {
        this.enquiryTime = enquiryTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getResponseLength() {
        return responseLength;
    }

    public void setResponseLength(Integer responseLength) {
        this.responseLength = responseLength;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getScoreName() {
        return scoreName;
    }

    public void setScoreName(String scoreName) {
        this.scoreName = scoreName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberRefNumber() {
        return memberRefNumber;
    }

    public void setMemberRefNumber(String memberRefNumber) {
        this.memberRefNumber = memberRefNumber;
    }

    public String getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }

    public List<ContactInformationList> getAddressSegmentList() {
        return addressSegmentList;
    }

    public void setAddressSegmentList(List<ContactInformationList> addressSegmentList) {
        this.addressSegmentList = addressSegmentList;
    }

    public List<EmailAddressList> getEmailAddressList() {
        return emailAddressList;
    }

    public void setEmailAddressList(List<EmailAddressList> emailAddressList) {
        this.emailAddressList = emailAddressList;
    }

    public List<PhoneNumberList> getPhoneNumberList() {
        return phoneNumberList;
    }

    public void setPhoneNumberList(List<PhoneNumberList> phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
    }

    public List<AccountInformationList> getAccountInformationList() {
        return accountInformationList;
    }

    public void setAccountInformationList(List<AccountInformationList> accountInformationList) {
        this.accountInformationList = accountInformationList;
    }

    public List<EnquiryInformationList> getEnquirySegmentsList() {
        return enquirySegmentsList;
    }

    public void setEnquirySegmentsList(List<EnquiryInformationList> enquirySegmentsList) {
        this.enquirySegmentsList = enquirySegmentsList;
    }

    public List<ResponseNameSegment> getNameSegmentList() {
        return nameSegmentList;
    }

    public void setNameSegmentList(List<ResponseNameSegment> nameSegmentList) {
        this.nameSegmentList = nameSegmentList;
    }

    public List<IdentificationList> getIdentificationSegmentList() {
        return identificationSegmentList;
    }

    public void setIdentificationSegmentList(List<IdentificationList> identificationSegmentList) {
        this.identificationSegmentList = identificationSegmentList;
    }

    public List<EmploymentInformationList> getEmploymentSegmentList() {
        return employmentSegmentList;
    }

    public void setEmploymentSegmentList(List<EmploymentInformationList> employmentSegmentList) {
        this.employmentSegmentList = employmentSegmentList;
    }

    public List<ResponseAccountNumber> getAccountNumbersList() {
        return accountNumbersList;
    }

    public void setAccountNumbersList(List<ResponseAccountNumber> accountNumbersList) {
        this.accountNumbersList = accountNumbersList;
    }

}
