package com.azeem.ou_app2.PrevQuesSetAndGetLists;


import com.azeem.ou_app2.RCV2.SingleItemDetails;

import java.util.ArrayList;
import java.util.List;

public class PopulateListsForClasses {


    public static List<SingleItemDetails> itFirstYear;
    public static List<SingleItemDetails> itSecondYear;
    public static List<SingleItemDetails> itThirdYear;
    public static List<SingleItemDetails> itFourthYear;

    public static List<SingleItemDetails> cseFirstYear;
    public static List<SingleItemDetails> cseSecondYear;
    public static List<SingleItemDetails> cseThirdYear;
    public static List<SingleItemDetails> cseFourthYear;

    public static List<SingleItemDetails> eceFirstYear;
    public static List<SingleItemDetails> eceSecondYear;
    public static List<SingleItemDetails> eceThirdYear;
    public static List<SingleItemDetails> eceFourthYear;

    public static List<SingleItemDetails> mechFirstYear;
    public static List<SingleItemDetails> mechSecondYear;
    public static List<SingleItemDetails> mechThirdYear;
    public static List<SingleItemDetails> mechFourthYear;

    public static List<SingleItemDetails> civilFirstYear;
    public static List<SingleItemDetails> civilSecondYear;
    public static List<SingleItemDetails> civilThirdYear;
    public static List<SingleItemDetails> civilFourthYear;

    public static List<SingleItemDetails> prodFirstYear;
    public static List<SingleItemDetails> prodSecondYear;
    public static List<SingleItemDetails> prodThirdYear;
    public static List<SingleItemDetails> prodFourthYear;

    public static List<SingleItemDetails> eeeFirstYear;
    public static List<SingleItemDetails> eeeSecondYear;
    public static List<SingleItemDetails> eeeThirdYear;
    public static List<SingleItemDetails> eeeFourthYear;

    public static List<SingleItemDetails> eieFirstYear;
    public static List<SingleItemDetails> eieSecondYear;
    public static List<SingleItemDetails> eieThirdYear;
    public static List<SingleItemDetails> eieFourthYear;

    static {
        itFirstYear = new ArrayList<SingleItemDetails>();
        itSecondYear = new ArrayList<SingleItemDetails>();
        itThirdYear = new ArrayList<SingleItemDetails>();
        itFourthYear = new ArrayList<SingleItemDetails>();

        cseFirstYear = new ArrayList<SingleItemDetails>();
        cseSecondYear = new ArrayList<SingleItemDetails>();
        cseThirdYear = new ArrayList<SingleItemDetails>();
        cseFourthYear = new ArrayList<SingleItemDetails>();

        eceFirstYear = new ArrayList<SingleItemDetails>();
        eceSecondYear = new ArrayList<SingleItemDetails>();
        eceThirdYear = new ArrayList<SingleItemDetails>();
        eceFourthYear = new ArrayList<SingleItemDetails>();

        mechFirstYear = new ArrayList<SingleItemDetails>();
        mechSecondYear = new ArrayList<SingleItemDetails>();
        mechThirdYear = new ArrayList<SingleItemDetails>();
        mechFourthYear = new ArrayList<SingleItemDetails>();

        civilFirstYear = new ArrayList<SingleItemDetails>();
        civilSecondYear = new ArrayList<SingleItemDetails>();
        civilThirdYear = new ArrayList<SingleItemDetails>();
        civilFourthYear = new ArrayList<SingleItemDetails>();

        prodFirstYear = new ArrayList<SingleItemDetails>();
        prodSecondYear = new ArrayList<SingleItemDetails>();
        prodThirdYear = new ArrayList<SingleItemDetails>();
        prodFourthYear = new ArrayList<SingleItemDetails>();

        eeeFirstYear = new ArrayList<SingleItemDetails>();
        eeeSecondYear = new ArrayList<SingleItemDetails>();
        eeeThirdYear = new ArrayList<SingleItemDetails>();
        eeeFourthYear = new ArrayList<SingleItemDetails>();

        eieFirstYear = new ArrayList<SingleItemDetails>();
        eieSecondYear = new ArrayList<SingleItemDetails>();
        eieThirdYear = new ArrayList<SingleItemDetails>();
        eieFourthYear = new ArrayList<SingleItemDetails>();
    }


    //IT
    public static void populate_it_first_year() {
        itFirstYear.add(new SingleItemDetails("BCPS",
                "https://drive.google.com/file/d/1Ewpm5xOxwxlZqhGu7Hez0X1o8VHDIHN8/view?usp=sharing"));
        itFirstYear.add(new SingleItemDetails("ECM",
                "https://drive.google.com/file/d/16tWDFYDlMEcJHz6p4LYv4iDghyz2u5oa/view?usp=sharing"));
        itFirstYear.add(new SingleItemDetails("Engineering Chemistry-II",
                "https://drive.google.com/file/d/1YtfWbnQHS8_5-pVJyMYZN4Ri2cA_wefb/view?usp=sharing"));
        itFirstYear.add(new SingleItemDetails("Engineering Mathematics-II",
                "https://drive.google.com/file/d/1UyTFbbsmB47-Tiat57f_GJIRKHbdFYZo/view?usp=sharing"));
        itFirstYear.add(new SingleItemDetails("Engineering Physics-II",
                "https://drive.google.com/file/d/1GwnFDpfwoaC00iKqMwpropwUBSKgCeLw/view?usp=sharing"));
        itFirstYear.add(new SingleItemDetails("EVS",
                "https://drive.google.com/file/d/1aQcMJ_MxzsqWG8BTDJwHVKreRblZ7RpJ/view?usp=sharing"));
        itFirstYear.add(new SingleItemDetails("OOPC",
                "https://drive.google.com/file/d/1JjNRtKxAO40iN1-xHaKg6tZRx2nymgFc/view?usp=sharing"));
    }
    public static void populate_it_second_year() {
        itSecondYear.add(new SingleItemDetails("COMP",
                "https://drive.google.com/open?id=12S9Vr47TGsX-5ohFOvH4sRhbNI413gQ-"));
        itSecondYear.add(new SingleItemDetails("DC",
                "https://drive.google.com/open?id=1D7CAbc0-K9UReqo3Q3MeFMIw915ptM-p"));
        itSecondYear.add(new SingleItemDetails("DELD",
                "https://drive.google.com/open?id=1-VUsEqXNSkPqEFL9nr5bxb5KUZeneQr2"));
        itSecondYear.add(new SingleItemDetails("DM",
                "https://drive.google.com/open?id=1XOlS8Jbw12x075-K-_tIRkaH7zSIUgMm"));
        itSecondYear.add(new SingleItemDetails("DS",
                "https://drive.google.com/open?id=1LM3ZJwzB0reGKfE6qEYmVJTv1D99kcSM"));
        itSecondYear.add(new SingleItemDetails("MEC",
                "https://drive.google.com/open?id=1ja7OMGS3gODKZWPM-86DyY9mM7_gNqi-"));
        itSecondYear.add(new SingleItemDetails("OOPJ",
                "https://drive.google.com/open?id=1B7BP9WoMjCldaJwkjH7imG2nsCayt1kK"));
        itSecondYear.add(new SingleItemDetails("PRP",
                "https://drive.google.com/open?id=1Bo7hic49cNVMEmQnKkoJ5ln5mK1CVxVf"));
        itSecondYear.add(new SingleItemDetails("SS",
                "https://drive.google.com/open?id=1d-licC94yOrI0QgPIxGWswKvZEbgIDYZ"));
        itSecondYear.add(new SingleItemDetails("WT",
                "https://drive.google.com/open?id=118uoyyKIOKJGF588sBPMa12ZH07tfD7d"));
    }
    public static void populate_it_third_year() {
        itThirdYear.add(new SingleItemDetails("AI",
                "https://drive.google.com/open?id=1JCblt2uDwpe6KL2Po3lMGSRP_-oZNK8A"));
        itThirdYear.add(new SingleItemDetails("AT",
                "https://drive.google.com/open?id=13GTISBIOy8c6_kgInm2tQ5IrRDGctudw"));
        itThirdYear.add(new SingleItemDetails("CN",
                "https://drive.google.com/open?id=13U7ryy6UglgUQ13Ebwf7ZzbgBBgMj3Fd"));
        itThirdYear.add(new SingleItemDetails("DBMS",
                "https://drive.google.com/open?id=1gNP0dCVShADk2TbllP_bTlyBv9CeCkqP"));
        itThirdYear.add(new SingleItemDetails("DSP",
                "https://drive.google.com/open?id=12SJ7yLj6Ie5MFCq0RxfMNxtm_gQfXseq"));
        itThirdYear.add(new SingleItemDetails("MEA",
                "https://drive.google.com/open?id=1BuqIVENre7YzkgL8MzsXYch_CAvoWsKD"));
        itThirdYear.add(new SingleItemDetails("OS",
                "https://drive.google.com/open?id=18u3LlQiGJur55OT_IqSCjgStpD5S9lfW"));
        itThirdYear.add(new SingleItemDetails("SE",
                "https://drive.google.com/open?id=1YUz8Uf9woOHkkHmaH-wjM_CSybB2zp46"));
    }
    public static void populate_it_fourth_year() {
        itFourthYear.add(new SingleItemDetails("ACA",
                "https://drive.google.com/file/d/1mROlwYD3WLvQjk1UeooAPBBKkkoMN0wk/view?usp=sharing"));
        itFourthYear.add(new SingleItemDetails("Adhoc Sensor Networks",
                "https://drive.google.com/open?id=1hMDNkJjfqQN9YZoaeg5UUIiXmx67SJvM"));
        itFourthYear.add(new SingleItemDetails("CC",
                "https://drive.google.com/open?id=1Tt1KaJITjdn7WicqqWzQTjod1P__LAao"));
        itFourthYear.add(new SingleItemDetails("DIP",
                "https://drive.google.com/open?id=1mW3_iRs8u0jProLPiqwTaJr-J4b3oLVN"));
        itFourthYear.add(new SingleItemDetails("Distributed Systems (DS)",
                "https://drive.google.com/open?id=14_e2z3YgNQjNTzwayJxFgkRbIas-05nH"));
        itFourthYear.add(new SingleItemDetails("DMM",
                "https://drive.google.com/open?id=10ezrVQbv8NZpU5y4u4P1WEgdcbKeVsA0"));
        itFourthYear.add(new SingleItemDetails("ENT",
                "https://drive.google.com/open?id=1X2AeElhyq66yKMtaQ6HYIO_PD0xQ9ih1"));
        itFourthYear.add(new SingleItemDetails("ES",
                "https://drive.google.com/open?id=1aacRDvcIKUhHe7hJWEUF6nRHsaQRTtxD"));
        itFourthYear.add(new SingleItemDetails("GC",
                "https://drive.google.com/open?id=15nxSeisa3uPy86KRDTbOiDGAuQghlqVE"));
        itFourthYear.add(new SingleItemDetails("HCI",
                "https://drive.google.com/open?id=1qktCxm_zsAIRLGU144dJPjuIRQksNHG_"));
        itFourthYear.add(new SingleItemDetails("IS",
                "https://drive.google.com/file/d/1-a8M3xE1ZHwlKnW3yIM6HAYzr9_enGMO/view?usp=drivesdk"));
        itFourthYear.add(new SingleItemDetails("IPR",
                "https://drive.google.com/open?id=1GNivOu6mAJJT_pEi49YGha30vUVlrXsN"));
        itFourthYear.add(new SingleItemDetails("IRS",
                "https://drive.google.com/open?id=1mROlwYD3WLvQjk1UeooAPBBKkkoMN0wk"));
        itFourthYear.add(new SingleItemDetails("ISM",
                "https://drive.google.com/open?id=1powTY7MoPwva0B-Y-2VUfZHNoXlaV6Rx"));
        itFourthYear.add(new SingleItemDetails("MT",
                "https://drive.google.com/open?id=1bZ0ZYCZwKcCG-Sde3XZ8cscnSHCJ2THh"));
        itFourthYear.add(new SingleItemDetails("NLP",
                "https://drive.google.com/open?id=1h0ia9Vrpbe1eLaPlRDwi5n2z9nor9L43"));
        itFourthYear.add(new SingleItemDetails("SW",
                "https://drive.google.com/open?id=15edEhlh2hNBpthRPzEmhGnZNpUnGfvNa"));
        itFourthYear.add(new SingleItemDetails("SC",
                "https://drive.google.com/open?id=1CYlb79y2zs4Dnc6_49XcWElmSA1xNT64"));
        itFourthYear.add(new SingleItemDetails("SPM",
                "https://drive.google.com/open?id=1y3tDPk-I-xKIF_NYV3dqYblNp38rQwSr"));
        itFourthYear.add(new SingleItemDetails("SRT",
                "https://drive.google.com/open?id=1rcV7FXDKzYeehza7McKqeVbJe4pCv0uw"));
        itFourthYear.add(new SingleItemDetails("VLSI",
                "https://drive.google.com/open?id=1ZEhKS0BX2Kz6KZjqItl-ldKoW3QzK56E"));
        itFourthYear.add(new SingleItemDetails("WMC",
                "https://drive.google.com/open?id=1U0VyTXyE5h3BlgdD-6rBZOt1sxSpbtM0"));

    }


    //CSE
    public static void populate_cse_first_year () {
        cseFirstYear.add(new SingleItemDetails("BCPS-II",
                "https://drive.google.com/open?id=10G86lPubG-ONqx9lyNK8_uzf7JVhIcWM"));
        cseFirstYear.add(new SingleItemDetails("Engineering Chemistry-II",
                "https://drive.google.com/open?id=1Pqhp69hbSC9hJmFHkKS6U5oqvA0O-Ocl"));
        cseFirstYear.add(new SingleItemDetails("Engineering Physics-II",
                "https://drive.google.com/open?id=1VUKEvrMEDYBBVq7Nof603rhMnn9awUZR"));
        cseFirstYear.add(new SingleItemDetails("Engineering Mathematics-II",
                "https://drive.google.com/open?id=13o0ajh7vCozNGpQIefuNKc4OonXDtv33"));
        cseFirstYear.add(new SingleItemDetails("OOPC",
                "https://drive.google.com/open?id=1CyHrfHhQxzAdFVWfdlboAGnEUV2D5eBR"));

    }
    public static void populate_cse_second_year () {
        cseSecondYear.add(new SingleItemDetails("BE",
                "https://drive.google.com/open?id=1nk-m9MB4_k3T94h52F-dR1Pqg0Dk3Tj9"));
        cseSecondYear.add(new SingleItemDetails("CA",
                "https://drive.google.com/open?id=19P73QSbjItt9w_HuDpAcVJXUYs4R0X0o"));
        cseSecondYear.add(new SingleItemDetails("DIS",
                "https://drive.google.com/open?id=1ZHThOzBpUTbiwI7cAq88tug0Cpz13A56"));
        cseSecondYear.add(new SingleItemDetails("DS",
                "https://drive.google.com/open?id=1lRYW8x8qXv8ty3dchSnZt6BbpSrDbjGx"));
        cseSecondYear.add(new SingleItemDetails("ECM",
                "https://drive.google.com/open?id=1rY5RcQDmSLUZbqZllxenOfytakhP8LYR"));
        cseSecondYear.add(new SingleItemDetails("ENV",
                "https://drive.google.com/open?id=1iSRbj8PW5l8zIhtnaVTlYToqe-BDCWFd"));
        cseSecondYear.add(new SingleItemDetails("LST",
                "https://drive.google.com/open?id=1lQGOsryTiuEXUi5yA-f_wRQpbfh_Ce4u"));
        cseSecondYear.add(new SingleItemDetails("M3",
                "https://drive.google.com/open?id=12WRW-f5qnqSjyZvu0pVETXEBlmzhhHWI"));
        cseSecondYear.add(new SingleItemDetails("M4",
                "https://drive.google.com/open?id=1C9OpQ3sA5oNKhuQWlb34RnW-QEgDEPz8"));
        cseSecondYear.add(new SingleItemDetails("MPI",
                "https://drive.google.com/open?id=1BAJsH7VOzPJruu0iCYd7_ITHS28nhnld"));
        cseSecondYear.add(new SingleItemDetails("OOPJ",
                "https://drive.google.com/open?id=1DHSdbtkdCbHC99UYevyEJpXclqTjYyeu"));
        cseSecondYear.add(new SingleItemDetails("PPL",
                "https://drive.google.com/open?id=1qKMpwP631uIZwr9uku643D_kfIdUtRSN"));
    }
    public static void populate_cse_third_year () {
        cseThirdYear.add(new SingleItemDetails("ALC",
                "https://drive.google.com/open?id=1tWJuGPwfnhXXMEavskIfIMnIbsX0s0lG"));
        cseThirdYear.add(new SingleItemDetails("CC",
                "https://drive.google.com/open?id=1u1lTr1TQ5jIKla6sA-hpEnfGsLPiHRS_"));
        cseThirdYear.add(new SingleItemDetails("CN",
                "https://drive.google.com/open?id=1I1Vi9tUfA5VQBJek0osV-FOLE2ZWhIPq"));
        cseThirdYear.add(new SingleItemDetails("DAA",
                "https://drive.google.com/open?id=1hWZII6yAo-LFQSKags0s4ueNXIFgjXSe"));
        cseThirdYear.add(new SingleItemDetails("DBMS",
                "https://drive.google.com/open?id=1UtxAapaauwkTtcDdqs0qKo6Aj1j3Qk31"));
        cseThirdYear.add(new SingleItemDetails("DC",
                "https://drive.google.com/open?id=1BWQ4Xi47BUePj53c_XUquGEYcktl7sSS"));
        cseThirdYear.add(new SingleItemDetails("MEA",
                "https://drive.google.com/open?id=1AkxG-qTUS2C5pz_XwZ7dpJL7JaYgOYWD"));
        cseThirdYear.add(new SingleItemDetails("OOSD",
                "https://drive.google.com/open?id=16Pv-O57Me6ljIWEppsJt_RWW99j2HWWf"));
        cseThirdYear.add(new SingleItemDetails("OS",
                "https://drive.google.com/open?id=1fvyvHinCgCZki4OkzmsmTXinLiZYbzZs"));
        cseThirdYear.add(new SingleItemDetails("SE",
                "https://drive.google.com/open?id=1NIAlSRXtMxvzK_96k3uCHxxVlAzussEk"));
        cseThirdYear.add(new SingleItemDetails("WPS",
                "https://drive.google.com/open?id=1zucmj5khExbIQuitFtJD5O3XHKK9rsLx"));
    }
    public static void populate_cse_fourth_year () {
        cseFourthYear.add(new SingleItemDetails("AD",
                "https://drive.google.com/open?id=1mWQr-3iTUKdcuu41CvrEoYWqeQDl4_PV"));
        cseFourthYear.add(new SingleItemDetails("AI",
                "https://drive.google.com/open?id=1pvhrTqSGQniX8yGum86-mqK9wQZABFIt"));
        cseFourthYear.add(new SingleItemDetails("CC",
                "https://drive.google.com/open?id=1v9nYyhls0jixcHVbsdRcTxbeqm49I6uC"));
        cseFourthYear.add(new SingleItemDetails("Data Mining(DM)",
                "https://drive.google.com/open?id=1dWIDFL6fVQvX3cVR05w1TuZmTBsJm7nu"));
        cseFourthYear.add(new SingleItemDetails("Distributed Systems (DS)",
                "https://drive.google.com/open?id=1I32ot7F6ZQ5DTArbEU_0HRstZK_KblDe"));
        cseFourthYear.add(new SingleItemDetails("DMM",
                "https://drive.google.com/open?id=1ciQ1V2g6Ww3_jbumb13yLAwvdDz3ZWK5"));
        cseFourthYear.add(new SingleItemDetails("ENT",
                "https://drive.google.com/open?id=1AxIkO2WmWFRqzRKCRbzFbB5a-ksUM91s"));
        cseFourthYear.add(new SingleItemDetails("HCI",
                "https://drive.google.com/open?id=1RZ7aphAK2dcnRih-zvGaPNU_47XCp3p4"));
        cseFourthYear.add(new SingleItemDetails("IP",
                "https://drive.google.com/open?id=1lZbCrJIuedO2SiD84EVWbaUCdII4hIVw"));
        cseFourthYear.add(new SingleItemDetails("IPR",
                "https://drive.google.com/open?id=1AXhdq_cvET2tOgdjkMLnNfjtUjsVkOIl"));
        cseFourthYear.add(new SingleItemDetails("IRS",
                "https://drive.google.com/open?id=1HuOq-v4pJMQb54_atyp3iMVra3qEiD9_"));
        cseFourthYear.add(new SingleItemDetails("IS",
                "https://drive.google.com/open?id=1i6CmbaSNccXYyISIAhzSOzBiSR4PGHdG"));
        cseFourthYear.add(new SingleItemDetails("ISM",
                "https://drive.google.com/open?id=1A9Zahae9EDjEBxUNB8se_rqRjyzjHDz9"));
        cseFourthYear.add(new SingleItemDetails("MC",
                "https://drive.google.com/open?id=1Btd-i0RDid_Otmw8uK00jy4FQe8bxujq"));
        cseFourthYear.add(new SingleItemDetails("MS",
                "https://drive.google.com/open?id=1FAhEL9pCnhP4JUBeUDH3diUOOzEcIf2k"));
        cseFourthYear.add(new SingleItemDetails("OR",
                "https://drive.google.com/open?id=117JjndvqcD16D0SixXgEwTM1g88C3Xub"));
        cseFourthYear.add(new SingleItemDetails("PAES",
                "https://drive.google.com/open?id=1cXMcuI0mEd4j945xwsKLeqCZBz6gMVzu"));
        cseFourthYear.add(new SingleItemDetails("RTS",
                "https://drive.google.com/open?id=1Bw_H8Hhnh95tKambfbMboe8nNqk4PTWq"));
        cseFourthYear.add(new SingleItemDetails("SAM",
                "https://drive.google.com/open?id=1A99L1vfQa-5jHtEd_TzAeIfL7YdaFmhW"));
        cseFourthYear.add(new SingleItemDetails("SPM",
                "https://drive.google.com/open?id=1p4Q8Yg0cAr2khiDEQpvXrhXOGmM6v54p"));
        cseFourthYear.add(new SingleItemDetails("SQT",
                "https://drive.google.com/open?id=1HLZlCjx2uHKTKlCU6RjtOo9irFpi6upK"));
        cseFourthYear.add(new SingleItemDetails("SRT",
                "https://drive.google.com/open?id=16g_JwnvKC-cUkNCI93KwCHfL0m-6z9pJ"));
    }



    //ECE
    public static void populate_ece_first_year () {
        eceFirstYear.add(new SingleItemDetails("BCA",
                "https://drive.google.com/open?id=1kf14yRUQYIJl-wqtwmXz8jZQ85VV8YEK"));
        eceFirstYear.add(new SingleItemDetails("BCPS-II",
                "https://drive.google.com/open?id=10G86lPubG-ONqx9lyNK8_uzf7JVhIcWM"));
        eceFirstYear.add(new SingleItemDetails("Engineering Chemistry-II",
                "https://drive.google.com/open?id=1Pqhp69hbSC9hJmFHkKS6U5oqvA0O-Ocl"));
        eceFirstYear.add(new SingleItemDetails("Engineering Physics-II",
                "https://drive.google.com/open?id=1VUKEvrMEDYBBVq7Nof603rhMnn9awUZR"));
        eceFirstYear.add(new SingleItemDetails("Engineering Mathematics-II",
                "https://drive.google.com/open?id=13o0ajh7vCozNGpQIefuNKc4OonXDtv33"));

    }
    public static void populate_ece_second_year () {

        eceSecondYear.add(new SingleItemDetails("AEC",
                "https://drive.google.com/open?id=1U5OprUQXTpGgEPYVJ55cn_2JUH98fBwY"));
        eceSecondYear.add(new SingleItemDetails("BCA",
                "https://drive.google.com/open?id=1nFvLG53nlCcL0yYdTgrvpDmOtwmwZzs8"));
        eceSecondYear.add(new SingleItemDetails("ED",
                "https://drive.google.com/open?id=123Qs3o2tghOv2HKLvMgX3wAaerKCWJbI"));
        eceSecondYear.add(new SingleItemDetails("EME",
                "https://drive.google.com/open?id=1UWLz9hl-OH4Tv8kFjHbnLKyb6sGF46to"));
        eceSecondYear.add(new SingleItemDetails("EMT",
                "https://drive.google.com/open?id=1Mu8wnyj7grA28oUL711FltCOCoDVMU8e"));
        eceSecondYear.add(new SingleItemDetails("ET",
                "https://drive.google.com/open?id=1H5xQcvcrhqoB5Pv-qa-KmfBcN_dAyHJB"));
        eceSecondYear.add(new SingleItemDetails("EVS",
                "https://drive.google.com/open?id=193ofEvP3iYT4sop9i7nqWii5I11-aS26"));
        eceSecondYear.add(new SingleItemDetails("M3",
                "https://drive.google.com/open?id=1-MRXpNpraGKxoGQFiNoQAyBYjgCLcvhj"));
        eceSecondYear.add(new SingleItemDetails("M4",
                "https://drive.google.com/open?id=1Vz8-2K5z9jskhEOh_c8Kggx2gFNcChD5"));
        eceSecondYear.add(new SingleItemDetails("NTL",
                "https://drive.google.com/open?id=1prvOdRYl5M7S03njFzZbYrq5iWrvcWRQ"));
        eceSecondYear.add(new SingleItemDetails("PDSC",
                "https://drive.google.com/open?id=1y7B7deyg6jj4mZjcyQfTWduxBCWgiSgM"));
        eceSecondYear.add(new SingleItemDetails("SATT",
                "https://drive.google.com/open?id=1dt4V-sQAlv8Lk9w9a4mxawQX3risuUHq"));

    }
    public static void populate_ece_third_year () {
        eceThirdYear.add(new SingleItemDetails("AC",
                "https://drive.google.com/open?id=154pyGgbyohBICFLn2ZavqV1Ypg09f2BC"));
        eceThirdYear.add(new SingleItemDetails("ACS",
                "https://drive.google.com/open?id=1-YybSAEII_EpbHPsOLCq4dw26DEX_SgR"));
        eceThirdYear.add(new SingleItemDetails("AWP",
                "https://drive.google.com/open?id=1o1UIdBWybeFxaRYhVeXerm_h_o-cgrvR"));
        eceThirdYear.add(new SingleItemDetails("COA",
                "https://drive.google.com/open?id=1ZeOYAdDKZZHHi2tDZ5e4ma6gsnKw2pyR"));
        eceThirdYear.add(new SingleItemDetails("DC",
                "https://drive.google.com/open?id=1Z7B10f66FHll6Cj44i5OPwf3mXYePVTH"));
        eceThirdYear.add(new SingleItemDetails("DSDV",
                "https://drive.google.com/open?id=16nI-K6y7mEs5bHjQoGP8b5IysZxPe4iq"));
        eceThirdYear.add(new SingleItemDetails("DSP",
                "https://drive.google.com/open?id=1KLxv6d9wLaQoGvRFwS8FD8rj8YeNwsAm"));
        eceThirdYear.add(new SingleItemDetails("LICA",
                "https://drive.google.com/open?id=1nQOmPQXZxPCpCGtAJlHjDuUnjeGAfPka"));
        eceThirdYear.add(new SingleItemDetails("MEA",
                "https://drive.google.com/open?id=1OoNrf-dhB_hxTHJva1zRrJLMEMqG81s1"));
        eceThirdYear.add(new SingleItemDetails("MM",
                "https://drive.google.com/open?id=1vZW9nBttDuzhBAlztfEdkNuqT3ibebRU"));
        eceThirdYear.add(new SingleItemDetails("PDC",
                "https://drive.google.com/open?id=1PYuog0cTMoYkDeZrXo_5zwSlIGEerXmM"));
    }
    public static void populate_ece_fourth_year () {

        eceFourthYear.add(new SingleItemDetails("CN",
                "https://drive.google.com/open?id=16viUijl6tOC4w7z81MscFOC0dbT1I_TI"));
        eceFourthYear.add(new SingleItemDetails("CTT",
                "https://drive.google.com/open?id=1OuN8USC6Rd4KFBTnaxvXEl1P48Ye9Yig"));
        eceFourthYear.add(new SingleItemDetails("DFTS",
                "https://drive.google.com/open?id=1cMzF2l7PUSf_8QAzmVuNwsnHF7J_8MQV"));
        eceFourthYear.add(new SingleItemDetails("DIP",
                "https://drive.google.com/open?id=19MMZH_6l0n9XNnfG1eK7bL7owD6cKoca"));
        eceFourthYear.add(new SingleItemDetails("DMM",
                "https://drive.google.com/open?id=1tjEZIhxaimYhhS8rJLWr4etPA6FIFBZh"));
        eceFourthYear.add(new SingleItemDetails("ES",
                "https://drive.google.com/open?id=1ICAqUxh1TkOuSc0pKvX2qJmZqpyAInMu"));
        eceFourthYear.add(new SingleItemDetails("GPS",
                "https://drive.google.com/open?id=1UgjqTRhxsZVRNEakaqb-dJaH4daM1nZF"));
        eceFourthYear.add(new SingleItemDetails("IAFM",
                "https://drive.google.com/open?id=1jmk2mfvhHyiMOZfwclOzZZolGLkazUQQ"));
        eceFourthYear.add(new SingleItemDetails("IPR",
                "https://drive.google.com/open?id=12nKcML8TTGbiJ9Fr42WVt58z5n5A2gtn"));
        eceFourthYear.add(new SingleItemDetails("MCC",
                "https://drive.google.com/open?id=1uHlN0fGH8KzpKMlqiltzXIad4Bu4GmP5"));
        eceFourthYear.add(new SingleItemDetails("ME",
                "https://drive.google.com/open?id=1yhMiPP1FWCSyym09cU86kRHE0LtO-sfB"));
        eceFourthYear.add(new SingleItemDetails("MRSP",
                "https://drive.google.com/open?id=1uBkNFspqXCS1kgRIMIYzxkVBUJmHb7_S"));
        eceFourthYear.add(new SingleItemDetails("NNFL",
                "https://drive.google.com/open?id=1kfVGB1C-PxXafAEvFRAQDSzhtwuK3Qkw"));
        eceFourthYear.add(new SingleItemDetails("NT",
                "https://drive.google.com/open?id=1pG60Pg_PvVUAAxcxuYwePQKQVpQdyNLW"));
        eceFourthYear.add(new SingleItemDetails("OFC",
                "https://drive.google.com/open?id=1A5igjgrOmFmeMaQ0_QKcoKZ0pEHWUycT"));
        eceFourthYear.add(new SingleItemDetails("RSC",
                "https://drive.google.com/open?id=1Tu_uvd7Qmpw60pOiGSF1malgba7FKSZZ"));
        eceFourthYear.add(new SingleItemDetails("RTOS",
                "https://drive.google.com/open?id=1yKGUpPkWaiqtJE4OkwcMpBpH1vrd9UMl"));
        eceFourthYear.add(new SingleItemDetails("SAC",
                "https://drive.google.com/open?id=1R8PrTq6kSuoUdLb1-IJXKgo-gxyB-lnz"));
        eceFourthYear.add(new SingleItemDetails("SET",
                "https://drive.google.com/open?id=1fS3c4zcTvXHHZoagAhOC7Sk7kLka0jqV"));
        eceFourthYear.add(new SingleItemDetails("VLD",
                "https://drive.google.com/open?id=1NzMXhDOare2GSahgU5BFz160-zvV_I17"));
        eceFourthYear.add(new SingleItemDetails("WSN",
                "https://drive.google.com/open?id=1W3jodxUDrJYNFQ2cf-nzv6phgz8aepXo"));
    }


    //MECH
    public static void populate_mech_first_year () {
        mechFirstYear.add(new SingleItemDetails("MECHANICS-II",
                "https://drive.google.com/open?id=1o_DQ0pGro3gzYl9rkE4A25_vjlk44ipP"));
        mechFirstYear.add(new SingleItemDetails("BCPS-II",
                "https://drive.google.com/open?id=10G86lPubG-ONqx9lyNK8_uzf7JVhIcWM"));
        mechFirstYear.add(new SingleItemDetails("Engineering Chemistry-II",
                "https://drive.google.com/open?id=1Pqhp69hbSC9hJmFHkKS6U5oqvA0O-Ocl"));
        mechFirstYear.add(new SingleItemDetails("Engineering Physics-II",
                "https://drive.google.com/open?id=1VUKEvrMEDYBBVq7Nof603rhMnn9awUZR"));
        mechFirstYear.add(new SingleItemDetails("Engineering Mathematics-II",
                "https://drive.google.com/open?id=13o0ajh7vCozNGpQIefuNKc4OonXDtv33"));
    }
    public static void populate_mech_second_year () {
        mechSecondYear.add(new SingleItemDetails("ECM",
                "https://drive.google.com/open?id=15etxowm0H8FSpYzYkspsR5kUsl33L6yK"));
        mechSecondYear.add(new SingleItemDetails("EVS",
                "https://drive.google.com/open?id=1OsZ4DUZQzFxZKuUwuCeSX5cVIlvo92xp"));
        mechSecondYear.add(new SingleItemDetails("FD",
                "https://drive.google.com/open?id=1--gkErRNFx02aoixmY4aj91HnEoRqw9d"));
        mechSecondYear.add(new SingleItemDetails("KM",
                "https://drive.google.com/open?id=1iZ-Qa4DA4s7-WNBeJJB0DaY5FU-FdySX"));
        mechSecondYear.add(new SingleItemDetails("M3",
                "https://drive.google.com/open?id=1q-ddj6I9xoEBSQKxjWBojZmghYdFxiXu"));
        mechSecondYear.add(new SingleItemDetails("M4",
                "https://drive.google.com/open?id=14YZsLjAY9Co5mHHzrQKhqQT-hM3fa9G7"));
        mechSecondYear.add(new SingleItemDetails("MD",
                "https://drive.google.com/open?id=1WUnJfSQH0BTaKTwy1YMiiYjFAy48mnL0"));
        mechSecondYear.add(new SingleItemDetails("MEA",
                "https://drive.google.com/open?id=1fQnCsK3-_riEwscIgKYQLJBIsrFWz_TH"));
        mechSecondYear.add(new SingleItemDetails("MM",
                "https://drive.google.com/open?id=16BaWkeIPl-wVc5ZZb_sqMCB8Nlo0nJN3"));
        mechSecondYear.add(new SingleItemDetails("MMS",
                "https://drive.google.com/open?id=1-3NctHAfUqeFchZSjfJsaCR5q1wssI_j"));
        mechSecondYear.add(new SingleItemDetails("TD",
                "https://drive.google.com/open?id=1cI0tjGO8wB2uRC_H239y-drNYRmtFWoH"));
    }
    public static void populate_mech_third_year () {
        mechThirdYear.add(new SingleItemDetails("AT",
                "https://drive.google.com/open?id=1eQaq-gvvcWveh1aeMm14hJqEcjjuJIG_"));
        mechThirdYear.add(new SingleItemDetails("CAD-M",
                "https://drive.google.com/open?id=1OEF8qj7WY7JSIb1T4Ep7j1lU_lGUvSpe"));
        mechThirdYear.add(new SingleItemDetails("CST",
                "https://drive.google.com/open?id=1Q4-rVLSBgOc3xFpkOFRFHIfMsi1SLLAT"));
        mechThirdYear.add(new SingleItemDetails("DM",
                "https://drive.google.com/open?id=1jRF81dCUFZDNjlnRbada5gVVOQWXR_6M"));
        mechThirdYear.add(new SingleItemDetails("DME",
                "https://drive.google.com/open?id=1CJx8No7pfE-5wnAXWTfWE8xxh3n9bTXL"));
        mechThirdYear.add(new SingleItemDetails("HMS",
                "https://drive.google.com/open?id=1LX09CwrO31113_tDrtwcsJ7hC8F2oGhe"));
        mechThirdYear.add(new SingleItemDetails("HT",
                "https://drive.google.com/open?id=1ahjLb0d4v8BBL-K3fmlP1TFazkyBoSLb"));
        mechThirdYear.add(new SingleItemDetails("MCMTE",
                "https://drive.google.com/open?id=1bnXwrGpAzorfE9UbG2ZjX29Om0XYddNm"));
        mechThirdYear.add(new SingleItemDetails("MD",
                "https://drive.google.com/open?id=1Gclz7fz3pgtC6ar620J0RF3Crak0hzfN"));
        mechThirdYear.add(new SingleItemDetails("MP",
                "https://drive.google.com/open?id=14AIpLxNIJLtkqHucA5NGO_5u0hO15Mtf"));
        mechThirdYear.add(new SingleItemDetails("RAC",
                "https://drive.google.com/open?id=1mGPPz2FxX2SoDLLQ7uWS0H6-OmIasozr"));
    }
    public static void populate_mech_fourth_year () {
        mechFourthYear.add(new SingleItemDetails("NMT",
                "https://drive.google.com/open?id=1VWDEgzsFjSaFq-pJezwrJkTmqGKH0YxV"));
        mechFourthYear.add(new SingleItemDetails("AE",
                "https://drive.google.com/open?id=1cB5c9ltpxwJmAx7kDA8M-7wmr_Wd77-7"));
        mechFourthYear.add(new SingleItemDetails("CFF",
                "https://drive.google.com/open?id=1vDdEbjSV4b6dJE4obvOFo8p1h8CcsEkX"));
        mechFourthYear.add(new SingleItemDetails("CM",
                "https://drive.google.com/open?id=1yAsCSUA_KMsdrrhjyMBvhDf_CF6azkXa"));
        mechFourthYear.add(new SingleItemDetails("DFM",
                "https://drive.google.com/open?id=157RCiECvzfcjWOCsyj6PhoIazAd2MWkq"));
        mechFourthYear.add(new SingleItemDetails("ENT",
                "https://drive.google.com/open?id=1VaH38aIsokbag1SzlHVoykPCnDDFWgYo"));
        mechFourthYear.add(new SingleItemDetails("FEA",
                "https://drive.google.com/open?id=1fWewH8iqSw67yO-hitd9KNNM8iWreM9V"));
        mechFourthYear.add(new SingleItemDetails("IPR",
                "https://drive.google.com/open?id=1pdi0boCAt-Ul2UL2sJoWw8MROFGMf7j7"));
        mechFourthYear.add(new SingleItemDetails("MI",
                "https://drive.google.com/open?id=12OUaPyAB9tGOEMEu-sCALmmIuj02rTu_"));
        mechFourthYear.add(new SingleItemDetails("MMFM",
                "https://drive.google.com/open?id=1x3707wInBQhVaJ9s8CgvLB4IkOvEXteo"));
        mechFourthYear.add(new SingleItemDetails("MTD",
                "https://drive.google.com/open?id=1DGp6sTpPKVI26Y9G1-GbQFh-qKr7wjMv"));
        mechFourthYear.add(new SingleItemDetails("NCES",
                "https://drive.google.com/open?id=1f2BuDSwMZJqOgYwcIl1bBfyxYAGejuH5"));
        mechFourthYear.add(new SingleItemDetails("OR",
                "https://drive.google.com/open?id=18RpHGIDj2F7D-0iET7KVgzM-wdwzfiJj"));
        mechFourthYear.add(new SingleItemDetails("PDPP",
                "https://drive.google.com/open?id=1DhwzCYnNy8n6dSOAim4woDZyemUi7Ab9"));
        mechFourthYear.add(new SingleItemDetails("POM",
                "https://drive.google.com/open?id=1TbBsP7gghmC8vzvuSjCWgg-eEmph6ghO"));
        mechFourthYear.add(new SingleItemDetails("PPE",
                "https://drive.google.com/open?id=1iz0HXRs_-XMUgdhNzdeHTfBBx3D1XkVl"));
        mechFourthYear.add(new SingleItemDetails("RPT",
                "https://drive.google.com/open?id=1cnY_yKlyWKC9-9LEtYAGd4fizYFUj_Sg"));
        mechFourthYear.add(new SingleItemDetails("TD",
                "https://drive.google.com/open?id=1OUHCDnNiBf7zCMZAMlNOQxBT6bP8NpIt"));
        mechFourthYear.add(new SingleItemDetails("TTM",
                "https://drive.google.com/open?id=1C-dteqX8U9nhG26De53_yutqyhFNkEPr"));
    }


    //CIVIL
    public static void populate_civil_first_year () {
        civilFirstYear.add(new SingleItemDetails("MECHANICS-II",
                "https://drive.google.com/open?id=1o_DQ0pGro3gzYl9rkE4A25_vjlk44ipP"));
        civilFirstYear.add(new SingleItemDetails("BCPS-II",
                "https://drive.google.com/open?id=10G86lPubG-ONqx9lyNK8_uzf7JVhIcWM"));
        civilFirstYear.add(new SingleItemDetails("Engineering Chemistry-II",
                "https://drive.google.com/open?id=1Pqhp69hbSC9hJmFHkKS6U5oqvA0O-Ocl"));
        civilFirstYear.add(new SingleItemDetails("Engineering Physics-II",
                "https://drive.google.com/open?id=1VUKEvrMEDYBBVq7Nof603rhMnn9awUZR"));
        civilFirstYear.add(new SingleItemDetails("Engineering Mathematics-II",
                "https://drive.google.com/open?id=13o0ajh7vCozNGpQIefuNKc4OonXDtv33"));
    }
    public static void populate_civil_second_year () {
        civilSecondYear.add(new SingleItemDetails("BPD",
                "https://drive.google.com/open?id=1dWjY6iEHN0EiNulMCVg1rVtngfFDgsHa"));
        civilSecondYear.add(new SingleItemDetails("EG",
                "https://drive.google.com/open?id=1jpswSMI1MEj_4IQdcyslu36QkkBev2PG"));
        civilSecondYear.add(new SingleItemDetails("EMC",
                "https://drive.google.com/open?id=1EYrrJ1GwmP1nEfWUhug4smCTVQw6dUaO"));
        civilSecondYear.add(new SingleItemDetails("ET",
                "https://drive.google.com/open?id=1oAJrI-LxKOcss8VHgcGLaBzj4i395bEW"));
        civilSecondYear.add(new SingleItemDetails("EVS",
                "https://drive.google.com/open?id=1ghO0bYpq3O5E7pBG3-6igA1W7OanLy_h"));
        civilSecondYear.add(new SingleItemDetails("FM1",
                "https://drive.google.com/open?id=1ggXzKxP0SUn4ilyYaXKXDxjbfUtUhbv7"));
        civilSecondYear.add(new SingleItemDetails("M3",
                "https://drive.google.com/open?id=1gIZPZBxGRDDy8hvmrUvzT5SGgilzbxu5"));
        civilSecondYear.add(new SingleItemDetails("SM1",
                "https://drive.google.com/open?id=1VB9wRWnuZ5ImZkgPOZwfRSm_pTOC8B3S"));
        civilSecondYear.add(new SingleItemDetails("SM2",
                "https://drive.google.com/open?id=1evR-9tQ2SZcbfJcIHItnDMbNCLTQtHTR"));
        civilSecondYear.add(new SingleItemDetails("SV1",
                "https://drive.google.com/open?id=175R41_z7tPjy33N_9QRbus0sU6eTsGzr"));
        civilSecondYear.add(new SingleItemDetails("SV2",
                "https://drive.google.com/open?id=1IEFp8nyeXev4hSoP2GMwRJu98j2oHMwg"));
    }
    public static void populate_civil_third_year () {
        civilThirdYear.add(new SingleItemDetails("BTS",
                "https://drive.google.com/open?id=1h2t-qhw-Q23NY-PXbmAmFyCrEyve1rC9"));
        civilThirdYear.add(new SingleItemDetails("FM2",
                "https://drive.google.com/open?id=1V5q-1ZWfqfhJM1hsMG8yga6X4AIwsFNN"));
        civilThirdYear.add(new SingleItemDetails("MEA",
                "https://drive.google.com/open?id=1tUtNCQ7eCvBIrYHbOFXagW8SpVbKk4-2"));
        civilThirdYear.add(new SingleItemDetails("RCC",
                "https://drive.google.com/open?id=12Ofg002Lm9Rh82-kvmFYQImf7NSqZS6s"));
        civilThirdYear.add(new SingleItemDetails("SEDD1",
                "https://drive.google.com/open?id=1SwKIcDmOzxCO6jlgrOoN6mJ4JMcr9Y8W"));
        civilThirdYear.add(new SingleItemDetails("SM",
                "https://drive.google.com/open?id=1VCK8FLgQQ9fekURi26T5zcRMF-8wwF7f"));
        civilThirdYear.add(new SingleItemDetails("SS",
                "https://drive.google.com/open?id=1CeL9XGpnL43BS5WwLg79Mr6MIhspum-H"));
        civilThirdYear.add(new SingleItemDetails("TE",
                "https://drive.google.com/open?id=1xXx3wVMGUOjmNJm1Xa98bPlFabK6htbt"));
        civilThirdYear.add(new SingleItemDetails("TS1",
                "https://drive.google.com/open?id=1UYTGC2jj-Jiq0V65Su_wDXjXjyrdsZyD"));
        civilThirdYear.add(new SingleItemDetails("TS2",
                "https://drive.google.com/open?id=1cIoYfBY0iahOYutoqRooepvzh8CqncUr"));
        civilThirdYear.add(new SingleItemDetails("WREM1",
                "https://drive.google.com/open?id=1GUN5N8O_t6_kuPpLS-MrrhBqm9a9RR04"));
        civilThirdYear.add(new SingleItemDetails("WWWE",
                "https://drive.google.com/open?id=1G8C2wAfzdnjxVSlobSRA2T3HRnkZdCRL"));
    }
    public static void populate_civil_fourth_year () {
        civilFourthYear.add(new SingleItemDetails("AEE",
                "https://drive.google.com/open?id=1eGll0r0lmYEritRpRaNymWYDjCSXBIwM"));
        civilFourthYear.add(new SingleItemDetails("ARCD",
                "https://drive.google.com/open?id=1ys-9RmRwcCnAnL-1YtE1OgZj_4A2oxNT"));
        civilFourthYear.add(new SingleItemDetails("ATE",
                "https://drive.google.com/open?id=1bLiY8BlyIRIJqwkaS1bdH-zndV1uV33M"));
        civilFourthYear.add(new SingleItemDetails("CMA",
                "https://drive.google.com/open?id=1DSQFtlKAJUL1bmK5TM9LhLPl-IhNHAVw"));
        civilFourthYear.add(new SingleItemDetails("CT",
                "https://drive.google.com/open?id=1QKpOdaqpdUI4eWIucifQSEsgFIdzK-ZA"));
        civilFourthYear.add(new SingleItemDetails("DMM",
                "https://drive.google.com/open?id=1H_iLtthYwae7tn4BnKuDbczaLQj47hgn"));
        civilFourthYear.add(new SingleItemDetails("EEE",
                "https://drive.google.com/open?id=19eeEJ7960mAQbiXi-v1EGxYbWI7NE9u5"));
        civilFourthYear.add(new SingleItemDetails("ENT",
                "https://drive.google.com/open?id=1s3sVIvR5TetGmn7DnPNjf_bHelFKbXBu"));
        civilFourthYear.add(new SingleItemDetails("ES",
                "https://drive.google.com/open?id=1dW1W0UnqPMjABQsdtK7BjUflVGWoBiUr"));
        civilFourthYear.add(new SingleItemDetails("FE",
                "https://drive.google.com/open?id=1H3PVxiayfxNVmg5mREh2l-IrKkwFsGAv"));
        civilFourthYear.add(new SingleItemDetails("FEM",
                "https://drive.google.com/open?id=1fBjHzA2GPKTE-OJKLTLS0BSWcYsRz7nM"));
        civilFourthYear.add(new SingleItemDetails("GIS",
                "https://drive.google.com/open?id=1GSiBJ9VRquDGAJnWYCnaThhK4p2v0MW7"));
        civilFourthYear.add(new SingleItemDetails("GIT",
                "https://drive.google.com/open?id=1xZC7D-kkdtKG7vXkuPwLUuq8NKOeqOdN"));
        civilFourthYear.add(new SingleItemDetails("GWH",
                "https://drive.google.com/open?id=1tm7FlF0VKH5GFm45hg_lNxMJTT_-ODSj"));
        civilFourthYear.add(new SingleItemDetails("HMRS",
                "https://drive.google.com/open?id=1drTHdCWTruPhU9F-BmergzoU-ZTykkIl"));
        civilFourthYear.add(new SingleItemDetails("IE",
                "https://drive.google.com/open?id=1uwAR3Aw0msq665L6zM-Q9m91gDWWxVGE"));
        civilFourthYear.add(new SingleItemDetails("IPR",
                "https://drive.google.com/open?id=1QDyF2F4oT4aVBTpOKLwwenS-8e1hccmF"));
        civilFourthYear.add(new SingleItemDetails("IS",
                "https://drive.google.com/open?id=1IaqJw0oMkEwLz6_EPd8wDKGr2G6XbrHq"));
        civilFourthYear.add(new SingleItemDetails("ORCE",
                "https://drive.google.com/open?id=1_jS2IWWGbb02Q0VL4ZyOxDuPdEIfNMO1"));
        civilFourthYear.add(new SingleItemDetails("PSC",
                "https://drive.google.com/open?id=1l9a4fCuZ9T_cHkIQOSTzksj8VjvjLtP_"));
        civilFourthYear.add(new SingleItemDetails("SEDD2",
                "https://drive.google.com/open?id=1g6BkgKFB18k_jzNkM9DQc1MvWWhECAZ5"));
        civilFourthYear.add(new SingleItemDetails("SGWM",
                "https://drive.google.com/open?id=11S1mBqbwK09tc0nj5JvI-1iVwSqBszV-"));
        civilFourthYear.add(new SingleItemDetails("WREM2",
                "https://drive.google.com/open?id=1BdEN1lJaov3LOZNA78QkqwFu99xhZAoc"));
    }


    //PROD
    public static void populate_prod_first_year () {
        prodFirstYear.add(new SingleItemDetails("MECHANICS-II",
                "https://drive.google.com/open?id=1o_DQ0pGro3gzYl9rkE4A25_vjlk44ipP"));
        prodFirstYear.add(new SingleItemDetails("BCPS-II",
                "https://drive.google.com/open?id=10G86lPubG-ONqx9lyNK8_uzf7JVhIcWM"));
        prodFirstYear.add(new SingleItemDetails("Engineering Chemistry-II",
                "https://drive.google.com/open?id=1Pqhp69hbSC9hJmFHkKS6U5oqvA0O-Ocl"));
        prodFirstYear.add(new SingleItemDetails("Engineering Physics-II",
                "https://drive.google.com/open?id=1VUKEvrMEDYBBVq7Nof603rhMnn9awUZR"));
        prodFirstYear.add(new SingleItemDetails("Engineering Mathematics-II",
                "https://drive.google.com/open?id=13o0ajh7vCozNGpQIefuNKc4OonXDtv33"));
        prodFirstYear.add(new SingleItemDetails("OOPC",
                "https://drive.google.com/open?id=1n0-GB9em-gnZAMOhOZ42Q5EfKLefKja_"));

    }
    public static void populate_prod_second_year () {
        prodSecondYear.add(new SingleItemDetails("ECM",
                "https://drive.google.com/open?id=17G58Y2pgSsuaeu2WAGmTQwjchXjiaVmb"));
        prodSecondYear.add(new SingleItemDetails("FD",
                "https://drive.google.com/open?id=1Kf5V5yYGjbYAFugitwIrZF8_Mo0XyYI8"));
        prodSecondYear.add(new SingleItemDetails("KM",
                "https://drive.google.com/open?id=15JkHbWOPaUwaS19Ke8a7TjCvoog0kycH"));
        prodSecondYear.add(new SingleItemDetails("M3",
                "https://drive.google.com/open?id=1VQTsVmhK1FG00yz8M2CuPJ7IPKbm-nYc"));
        prodSecondYear.add(new SingleItemDetails("M4",
                "https://drive.google.com/open?id=1zaxM1YjSID8isZUC_e-eKJNYSIqGTZTA"));
        prodSecondYear.add(new SingleItemDetails("MD",
                "https://drive.google.com/open?id=1itX73aPBmOH_LZy3qIUJP3-wHjZcvX5j"));

        prodSecondYear.add(new SingleItemDetails("MEA",
                "https://drive.google.com/open?id=1n_15B_Ytq16GneW-8mqfaPfvuS9NN8yI"));
        prodSecondYear.add(new SingleItemDetails("MM",
                "https://drive.google.com/open?id=11u0vaqTIe0MTYf_GrShizk5FcZS4go_W"));
        prodSecondYear.add(new SingleItemDetails("MMS",
                "https://drive.google.com/open?id=1noRUOhvW1rGEjrfF36aC93USinGiLvQI"));
        prodSecondYear.add(new SingleItemDetails("THD",
                "https://drive.google.com/open?id=1z3PxKRsRohYigj-lscM99_H5LE-Bek7E"));





    }
    public static void populate_prod_third_year () {
        prodThirdYear.add(new SingleItemDetails("ATHT",
                "https://drive.google.com/open?id=1SB2Qbocqz4_G3ex1YxO4Rps9elJKfunQ"));
        prodThirdYear.add(new SingleItemDetails("DM",
                "https://drive.google.com/open?id=1ugCMXPBk4VIkKfjqG9wgENj1cAdgk4Ts"));
        prodThirdYear.add(new SingleItemDetails("DME",
                "https://drive.google.com/open?id=1IUBwFfJnlHkjAL7eWM2mSJ3aem_HCmmy"));
        prodThirdYear.add(new SingleItemDetails("MCW",
                "https://drive.google.com/open?id=1pL7cX5NZhRb8bgsLn22o88b0stkvGC06"));
        prodThirdYear.add(new SingleItemDetails("MD",
                "https://drive.google.com/open?id=17wpdMgzCe6M-WfD_7AHZ5IYK8EkGkoV9"));
        prodThirdYear.add(new SingleItemDetails("MFT",
                "https://drive.google.com/open?id=1E8Q-7Ik_WBUjd9MSrtufFpuzjA8ty34h"));
        prodThirdYear.add(new SingleItemDetails("MTE",
                "https://drive.google.com/open?id=1W3tfQlUfxJSvPldSHnAIy5HsuvOhaxOA"));
        prodThirdYear.add(new SingleItemDetails("RAC",
                "https://drive.google.com/open?id=1iYepIDoP8ckcLj21Yl_u_xdLUi4NhRV4"));
        prodThirdYear.add(new SingleItemDetails("TM",
                "https://drive.google.com/open?id=1k3U5M4kYqZaW7p3TcYMMG8DjgbWkTpMX"));
    }
    public static void populate_prod_fourth_year () {
        prodFourthYear.add(new SingleItemDetails("AE",
                "https://drive.google.com/open?id=1-9oqGSv5qDaUDVXx3pXhQMYpc2lQEp0U"));
        prodFourthYear.add(new SingleItemDetails("CFF",
                "https://drive.google.com/open?id=1QKSB8fLbp0Ll6jNURyX8tuVmF8_Ja_4t"));
        prodFourthYear.add(new SingleItemDetails("CM",
                "https://drive.google.com/open?id=1-dLe5y1w5B6hkg3uWlDV-NT78hPj_UD6"));
        prodFourthYear.add(new SingleItemDetails("CST",
                "https://drive.google.com/open?id=1MDJwQo6gLmxNjxZx-5Tm71bbJcyZNcsJ"));
        prodFourthYear.add(new SingleItemDetails("DFM",
                "https://drive.google.com/open?id=1fo7xa5SldvF5sYMRpKP7rGAtbJ8qZ8YJ"));
        prodFourthYear.add(new SingleItemDetails("ENT",
                "https://drive.google.com/open?id=1OzdlkZuJhanDBuzrCkU9qPixutcO1_3t"));
        prodFourthYear.add(new SingleItemDetails("FEA",
                "https://drive.google.com/open?id=15LsaXO2ergDpmcK9dPyrh-H6LZTKz4BJ"));
        prodFourthYear.add(new SingleItemDetails("IPR",
                "https://drive.google.com/open?id=1wUZHO_OG6wmtzY2tJLYUFvkF-j1GPnSH"));
        prodFourthYear.add(new SingleItemDetails("MI",
                "https://drive.google.com/open?id=1-hcForqb_9RhWjWNe4xPGvjJeBgKD6NK"));
        prodFourthYear.add(new SingleItemDetails("MMFM",
                "https://drive.google.com/open?id=1zcOnUvCC-3Z-8ynmZF82_8_LJclE3K5M"));
        prodFourthYear.add(new SingleItemDetails("MTD",
                "https://drive.google.com/open?id=1FmLl-hwlu3yNjBrduV0zDx8f1MBEmg6p"));
        prodFourthYear.add(new SingleItemDetails("MTN",
                "https://drive.google.com/open?id=1vFH7Yv3CgPDBtzaiN6iqiZwlBb3hgORX"));
        prodFourthYear.add(new SingleItemDetails("NMT",
                "https://drive.google.com/open?id=19r1i6lcg2iCI8CsjhLJ9f6tbX3sKL8-f"));
        prodFourthYear.add(new SingleItemDetails("OR",
                "https://drive.google.com/open?id=1PYxSymOwLTq_qPWi-EnSk9bkYjZxU9Vg"));
        prodFourthYear.add(new SingleItemDetails("PDP",
                "https://drive.google.com/open?id=1Hc9PQiKVrL9CGMlxMjpDmv7RkXcDoKCc"));
        prodFourthYear.add(new SingleItemDetails("PDPP",
                "https://drive.google.com/open?id=1Ty0V2FbuScPBzfd2UHLZoeud4H9oeLeo"));
        prodFourthYear.add(new SingleItemDetails("POM",
                "https://drive.google.com/open?id=1E1T71fw-2q1qFMK8HYMlrEePnV_ifJMt"));
        prodFourthYear.add(new SingleItemDetails("PPE",
                "https://drive.google.com/open?id=1RMPxt7P9e2TL-kzmPs_boduN5vRNHopF"));
        prodFourthYear.add(new SingleItemDetails("RPT",
                "https://drive.google.com/open?id=1Orj824cJGrII_dniRA5l96swKWn72v5p"));

    }


    //EEE
    public static void populate_eee_first_year () {
        eeeFirstYear.add(new SingleItemDetails("BCPS-II",
                "https://drive.google.com/open?id=10G86lPubG-ONqx9lyNK8_uzf7JVhIcWM"));
        eeeFirstYear.add(new SingleItemDetails("Engineering Chemistry-II",
                "https://drive.google.com/open?id=1Pqhp69hbSC9hJmFHkKS6U5oqvA0O-Ocl"));
        eeeFirstYear.add(new SingleItemDetails("Engineering Physics-II",
                "https://drive.google.com/open?id=1VUKEvrMEDYBBVq7Nof603rhMnn9awUZR"));
        eeeFirstYear.add(new SingleItemDetails("Engineering Mathematics-II",
                "https://drive.google.com/open?id=13o0ajh7vCozNGpQIefuNKc4OonXDtv33"));
        eeeFirstYear.add(new SingleItemDetails("EME",
                "https://drive.google.com/open?id=1LFdtD9yR8NFGYCF-FUmHi4yb3hhIKkBx"));
    }
    public static void populate_eee_second_year () {
        eeeSecondYear.add(new SingleItemDetails("EC1",
                "https://drive.google.com/open?id=1EZ8lYjgAD2T-G-Nj2AuxEwrXtaJYiXGO"));
        eeeSecondYear.add(new SingleItemDetails("EC2",
                "https://drive.google.com/open?id=1BdHL-B4sM6Gr867jkXPPYQ4Z0jYP3j6A"));
        eeeSecondYear.add(new SingleItemDetails("EE1",
                "https://drive.google.com/open?id=1bf07E5CS2vpTHmU6NE0XBYqp8wntwmUj"));
        eeeSecondYear.add(new SingleItemDetails("EE2",
                "https://drive.google.com/open?id=1aOcBLx3CmQmRiGwWUTk3rqGrMkMdri-3"));
        eeeSecondYear.add(new SingleItemDetails("EM1",
                "https://drive.google.com/open?id=17Rddzv4OrhH2BfGU5m014vaY32utMpBW"));
        eeeSecondYear.add(new SingleItemDetails("EMI",
                "https://drive.google.com/open?id=16yw4a8qhnjU1E1LxC3hwQ_SH4QvPvmMD"));
        eeeSecondYear.add(new SingleItemDetails("ET",
                "https://drive.google.com/open?id=17d15iauJV4Doj9P1nDmN_KonOK1rnu0m"));
        eeeSecondYear.add(new SingleItemDetails("EVS",
                "https://drive.google.com/open?id=1hnIz7vqRM8ca4nQN1u_c-8YTlvqTAsZg"));
        eeeSecondYear.add(new SingleItemDetails("M3",
                "https://drive.google.com/open?id=1JLKeou86dtdMpR0v49a4qBYb084KosZ4"));
        eeeSecondYear.add(new SingleItemDetails("PME",
                "https://drive.google.com/open?id=1uMdFWDjcQo9t_q5hOJSxA2fR3vxHfKDO"));
        eeeSecondYear.add(new SingleItemDetails("PS1",
                "https://drive.google.com/open?id=1VjnCVc32hL7MiP92fsHNTmlMdhMh0jtm"));
        eeeSecondYear.add(new SingleItemDetails("SM",
                "https://drive.google.com/open?id=1H7SE5gELav0QvlLSYEsBbTSqIpqq19eH"));
    }
    public static void populate_eee_third_year () {
        eeeThirdYear.add(new SingleItemDetails("DELD",
                "https://drive.google.com/open?id=1jjIMTgbYMkYfaAtE-MPtrCLd-8dJPAeR"));
        eeeThirdYear.add(new SingleItemDetails("DSP",
                "https://drive.google.com/open?id=1TWnhTtPQ6ElB8OIF-yOC8B_q0Bl8UF5G"));
        eeeThirdYear.add(new SingleItemDetails("EM2",
                "https://drive.google.com/open?id=1zPAPDlI3EE466FtDlJ_HQ3CEjwLE-_96"));
        eeeThirdYear.add(new SingleItemDetails("EM3",
                "https://drive.google.com/open?id=196bzLhw6jxKJxJmArB5aaAFtKnGvI9-A"));
        eeeThirdYear.add(new SingleItemDetails("LCS",
                "https://drive.google.com/open?id=17WPciRx53JU5tdfVjBqD4hikR-qlEZZP"));
        eeeThirdYear.add(new SingleItemDetails("LIC",
                "https://drive.google.com/open?id=1I9vUAw6abTyl1TzsBhkzGW3zqPC8s4iC"));
        eeeThirdYear.add(new SingleItemDetails("MEA",
                "https://drive.google.com/open?id=1t40UkxLOsbk9bZDqnLk91sSRKZgIUrfl"));
        eeeThirdYear.add(new SingleItemDetails("MM",
                "https://drive.google.com/open?id=1GzT2D38XtBX4ZMySrpDGdr1oWW3DeQkE"));
        eeeThirdYear.add(new SingleItemDetails("PE",
                "https://drive.google.com/open?id=1Ige0G8x_M3ZqgW77CY64iNZWqBl7hLSE"));
        eeeThirdYear.add(new SingleItemDetails("PS2",
                "https://drive.google.com/open?id=1ivBG035JYaYwQTK4t03FmKla669HPlYC"));
        eeeThirdYear.add(new SingleItemDetails("SGP",
                "https://drive.google.com/open?id=1BiEGC0icl6q8ps4XpO7YYpM9Wob0shY7"));
    }
    public static void populate_eee_fourth_year () {
        eeeFourthYear.add(new SingleItemDetails("ACS",
                "https://drive.google.com/open?id=1TJBojumbYx8Y3gZLYY10AHvgu1GDSquj"));
        eeeFourthYear.add(new SingleItemDetails("DMM",
                "https://drive.google.com/open?id=14STmJuXOW3h-_angR5Ev-KSYAixzjlAV"));
        eeeFourthYear.add(new SingleItemDetails("EDSC",
                "https://drive.google.com/open?id=151bT8hgTOds3rSO8NpyITocAo5np2AXL"));
        eeeFourthYear.add(new SingleItemDetails("EIS",
                "https://drive.google.com/open?id=1WtlV5OCl_NpbJ0m9IGJWkVD5RwDnVCwG"));
        eeeFourthYear.add(new SingleItemDetails("EMD",
                "https://drive.google.com/open?id=1pgFo1RXTYlbL-jNMqCoe36whTrs6W-Zj"));
        eeeFourthYear.add(new SingleItemDetails("ENT",
                "https://drive.google.com/open?id=1Q002QeymN94mjtTsADXMP4Y-I_pBojya"));
        eeeFourthYear.add(new SingleItemDetails("EPDE",
                "https://drive.google.com/open?id=1Bx0xIaIdffcOwe24RpRfaKVHEMwAwLV2"));
        eeeFourthYear.add(new SingleItemDetails("ES",
                "https://drive.google.com/open?id=19FzdOCUPRGv1tdCQNmGkzS23RCJSKcpG"));
        eeeFourthYear.add(new SingleItemDetails("HVDT",
                "https://drive.google.com/open?id=1SSxGkeunOMGSakCFCXtA3S47G3mMg_3i"));
        eeeFourthYear.add(new SingleItemDetails("HVE",
                "https://drive.google.com/open?id=1fT-L0zzmcvQmmpAgun1yBh6eqFBMgyGK"));
        eeeFourthYear.add(new SingleItemDetails("IAFM",
                "https://drive.google.com/open?id=1ucY6ddT0BRXy9GPFUMR1M4tgpGyRmPRI"));
        eeeFourthYear.add(new SingleItemDetails("IP",
                "https://drive.google.com/open?id=1Dx0zcZ1pp7bRJrlElYMzq93HB5NWqGRo"));
        eeeFourthYear.add(new SingleItemDetails("IPR",
                "https://drive.google.com/open?id=1tNcf1fARJuf5beLZGggsuAU-g7l-3TxR"));
        eeeFourthYear.add(new SingleItemDetails("IS",
                "https://drive.google.com/open?id=19hHBPhV8MfGACXPeZeJ9UAEe5ucywkGC"));
        eeeFourthYear.add(new SingleItemDetails("NE",
                "https://drive.google.com/open?id=1T6fISSr9iMIk5STZRwRL11XsiCraDFXn"));
        eeeFourthYear.add(new SingleItemDetails("OM",
                "https://drive.google.com/open?id=1lBdid7V9xJJcnYZ7HONhbjyM50I6JJSW"));
        eeeFourthYear.add(new SingleItemDetails("PQ",
                "https://drive.google.com/open?id=1Rvbh2bol-gve2A0UxRnD17gwe7x9srrY"));
        eeeFourthYear.add(new SingleItemDetails("PSOC",
                "https://drive.google.com/open?id=1qcmuJPce8FB_OdwqMFVaImUGasChw3HJ"));
        eeeFourthYear.add(new SingleItemDetails("PSR",
                "https://drive.google.com/open?id=1amU1DP2srjmQwsYUV3U1JJ3x3hn6IiVD"));
        eeeFourthYear.add(new SingleItemDetails("RES",
                "https://drive.google.com/open?id=1aTHg2s9P3N9SLedq1IXAX5mj5iV9ma57"));
        eeeFourthYear.add(new SingleItemDetails("SC",
                "https://drive.google.com/open?id=1zJAkmqxIc7uPiM0Z08fhEAsRVO4Mm0mq"));
        eeeFourthYear.add(new SingleItemDetails("TD",
                "https://drive.google.com/open?id=1uzMLROFwqkx3_rtpc28-uI7tjdmTHgmQ"));
        eeeFourthYear.add(new SingleItemDetails("UT",
                "https://drive.google.com/open?id=16-uzEsPd1DlasHMd7E1suwgRoDtgqJbQ"));
    }


    //EIE
    public static void populate_eie_first_year () {
        eieFirstYear.add(new SingleItemDetails("EME",
                "https://drive.google.com/open?id=1cM3jMtWNVg0Ak7rKof4AGhRhpxGRV9dn"));
        eieFirstYear.add(new SingleItemDetails("BCPS-II",
                "https://drive.google.com/open?id=10G86lPubG-ONqx9lyNK8_uzf7JVhIcWM"));
        eieFirstYear.add(new SingleItemDetails("Engineering Chemistry-II",
                "https://drive.google.com/open?id=1Pqhp69hbSC9hJmFHkKS6U5oqvA0O-Ocl"));
        eieFirstYear.add(new SingleItemDetails("Engineering Physics-II",
                "https://drive.google.com/open?id=1VUKEvrMEDYBBVq7Nof603rhMnn9awUZR"));
        eieFirstYear.add(new SingleItemDetails("Engineering Mathematics-II",
                "https://drive.google.com/open?id=13o0ajh7vCozNGpQIefuNKc4OonXDtv33"));
    }
    public static void populate_eie_second_year () {
        eieSecondYear.add(new SingleItemDetails("EE1",
                "https://drive.google.com/open?id=1a43ITfKLvBXqeliZwtbwEJEMWIIwIDRb"));
        eieSecondYear.add(new SingleItemDetails("EE2",
                "https://drive.google.com/open?id=10mjA-9EdBV76iv8wKQN-pW2oUt_63qac"));
        eieSecondYear.add(new SingleItemDetails("EM",
                "https://drive.google.com/open?id=1z0ljfQaBJ2gaGbtey3Lr7D3QJigA9awP"));
        eieSecondYear.add(new SingleItemDetails("EMI",
                "https://drive.google.com/open?id=1aoR7Fk2zkhjW1XL33ZTG7LX7ZHXOk2Ge"));
        eieSecondYear.add(new SingleItemDetails("EMT",
                "https://drive.google.com/open?id=11iYKAoD8I3Rq08p3FsSL97lyWgBWRRrm"));
        eieSecondYear.add(new SingleItemDetails("EPT",
                "https://drive.google.com/open?id=1phgzap-kg7M6iyU-EFLzHJS25bunvYJc"));
        eieSecondYear.add(new SingleItemDetails("EVS",
                "https://drive.google.com/open?id=1G9K08UREo7T6DQ144-yRBPDvSNEa9D-V"));
        eieSecondYear.add(new SingleItemDetails("M3",
                "https://drive.google.com/open?id=1QtjCZHs--duM6l3zsXqp08X_CrktAeyH"));
        eieSecondYear.add(new SingleItemDetails("NT",
                "https://drive.google.com/open?id=1OHoa1QuzZNckWQpdLOYriMzYL6I0gyrT"));
        eieSecondYear.add(new SingleItemDetails("SM",
                "https://drive.google.com/open?id=1Szr0TN4Tca7qHYMAF92PjzIW1-nhN1v2"));
        eieSecondYear.add(new SingleItemDetails("TE",
                "https://drive.google.com/open?id=18XxRkUrcqRqJ0L25iZUoEfuDoWbQA8CV"));
        eieSecondYear.add(new SingleItemDetails("TFM",
                "https://drive.google.com/open?id=1aMYWw-GMhpD9mJOZyL2T150nicitzLWK"));

    }
    public static void populate_eie_third_year () {
        eieThirdYear.add(new SingleItemDetails("DELD",
                "https://drive.google.com/open?id=1ixu3sRuHp6dHbiS-NU1WYEHRya3s_1Gu"));
        eieThirdYear.add(new SingleItemDetails("DSP",
                "https://drive.google.com/open?id=1CCFLvIgIBqKebiFqrS7uti90S2gk2o-C"));
        eieThirdYear.add(new SingleItemDetails("IS",
                "https://drive.google.com/open?id=10judSPvXRyeWjyAR2oIYIUonWsGT2yb9"));
        eieThirdYear.add(new SingleItemDetails("LCS",
                "https://drive.google.com/open?id=1QfVSFP0AxXm1_is8tt2Ne8CALlxVs3TH"));
        eieThirdYear.add(new SingleItemDetails("LIC",
                "https://drive.google.com/open?id=1mDhAfZ9E7Vczu4p4jfet5KKZnpq9AhO4"));
        eieThirdYear.add(new SingleItemDetails("MEA",
                "https://drive.google.com/open?id=1O4c5zXMJGPmwTf5s-EXxqnEwlnICFr9f"));
        eieThirdYear.add(new SingleItemDetails("MM",
                "https://drive.google.com/open?id=1X4LlujUm003VEg5pinARFWgENwopFZat"));
        eieThirdYear.add(new SingleItemDetails("PE",
                "https://drive.google.com/open?id=1cdcTidAfjql4y2epYtG_6FOfA9hMf9RZ"));
        eieThirdYear.add(new SingleItemDetails("PPI",
                "https://drive.google.com/open?id=1V1R_oEbSoVzfcdYCDqg9n1nbNjddC3OJ"));
    }
    public static void populate_eie_fourth_year () {
        eieFourthYear.add(new SingleItemDetails("ACS",
                "https://drive.google.com/open?id=1UvcvzmoGHByHtw8C0ZTvmxneOONPqyOb"));
        eieFourthYear.add(new SingleItemDetails("AI",
                "https://drive.google.com/open?id=1HG9rcTa3OK8KkjnkWYUkRihgYFzIpa46"));
        eieFourthYear.add(new SingleItemDetails("ENT",
                "https://drive.google.com/open?id=1vuok8rO0S3FnslNwvzAyf-P-TZCt4DZw"));
        eieFourthYear.add(new SingleItemDetails("IAFM",
                "https://drive.google.com/open?id=1gQRX7By-F6AV2qnPw7h2aB9qQodmqhHH"));
        eieFourthYear.add(new SingleItemDetails("IPR",
                "https://drive.google.com/open?id=1AAUlH6TbQIJw4-DmiM0zd3eVVk517MTV"));
        eieFourthYear.add(new SingleItemDetails("OEI",
                "https://drive.google.com/open?id=1lTZoj-aZOQP28IRRhTnLJzIqiTI7mp3Q"));
        eieFourthYear.add(new SingleItemDetails("OM",
                "https://drive.google.com/open?id=1okVTVCEXth_6sRH9bsspyuX--RlRR1GF"));
        eieFourthYear.add(new SingleItemDetails("RBT",
                "https://drive.google.com/open?id=1EEoZQ2Zd61gKJnPu3lt62_RJL4tW93Vn"));
        eieFourthYear.add(new SingleItemDetails("RES",
                "https://drive.google.com/open?id=13bEcyIasPRe7ipBn_NqSSJTc4gF5Q65E"));
        eieFourthYear.add(new SingleItemDetails("SC",
                "https://drive.google.com/open?id=1RapFJkj7GpogSj1__1B5_ZZE7UoF3eFB"));
        eieFourthYear.add(new SingleItemDetails("VLSID",
                "https://drive.google.com/open?id=1SiogDpXvLSMJ27Ay50xfQhlr0FJIEeDd"));
    }

}
