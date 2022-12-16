package com.namkwang.toy_servlets;

import java.util.ArrayList;
import java.util.HashMap;

import com.namkwang.toy_servlets.beans.MemberBean;

public class DatasInfo {
    public HashMap<String, String> getSearchFormData() {
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "남광");
        searchForm.put("affiliation", "KH정보교육원");
        return searchForm;
    }

    public ArrayList<MemberBean> getTablesListWithString() {
        ArrayList<MemberBean> tablesListWithString = new ArrayList<MemberBean>();
        tablesListWithString.set(0, getDataWithMemberBean());
        tablesListWithString.set(1, getDataWithMemberBean());
        tablesListWithString.set(2, getDataWithMemberBean());
        return tablesListWithString;
    }

    // public HashMap<String, Object> getBundleData() {

    // DatasInfo datasInfo = new DatasInfo();
    // HashMap<String, String> searchForm = datasInfo.getSearchFormData();
    // ArrayList<String> tablesListWithString = datasInfo.getTablesListWithString();

    // HashMap<String, Object> bundlesData = new HashMap<>();
    // bundlesData.put("searchForm", searchForm);
    // bundlesData.put("tablesListWithString", tablesListWithString);

    // bundlesData.put("dataWithMemberBean", datasInfo.getDataWithMemberBean());
    // bundlesData.put("dataListWithMemberBean",
    // datasInfo.getDataListWithMemberBean());

    // return bundlesData;
    // }
    // <String, String> 자리에 하나는 HaspMap, 하나는 Array를 넣어준다.

    public MemberBean getDataWithMemberBean() {
        MemberBean memberBean = new MemberBean();
        memberBean.setQuestions_list("question_list");
        memberBean.setAnswer_list("answer_list");
        memberBean.setQuestions_answers("@question_answers");

        return memberBean;
    }

    public ArrayList<MemberBean> getDataListWithMemberBean() {
        ArrayList<MemberBean> membersList = new ArrayList<>();
        MemberBean memberBean = new MemberBean();
        memberBean.setQuestions_list("Mark");
        memberBean.setAnswer_list("Otto");
        memberBean.setQuestions_answers("@mdo");
        membersList.add(memberBean);

        MemberBean memberBean02 = new MemberBean();
        memberBean02.setQuestions_list("Jacob");
        memberBean02.setAnswer_list("Thorton");
        memberBean02.setQuestions_answers("@fat");
        membersList.add(memberBean02);

        MemberBean memberBean03 = new MemberBean();
        memberBean03.setQuestions_list("Larry");
        memberBean03.setAnswer_list("Bird");
        memberBean03.setQuestions_answers("@Twitter");
        membersList.add(memberBean03);
        return membersList;
    }
}
