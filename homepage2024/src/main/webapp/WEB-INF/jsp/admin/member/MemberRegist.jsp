<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:import url="/template/header.do" charEncoding="utf-8">
	<c:param name="title" value="회원관리"/>
</c:import>

<%-- 기본 URL --%>
<c:url var="_BASE_PARAM" value="">
  	<c:param name="searchCondition" value="${searchVO.searchCondition}" />
  	<c:param name="searchKeyword" value="${searchVO.searchKeyword}" />
</c:url>

<div class="container">
	<div id="contents">
		<table class="chart2">
	        <caption>게시글 작성</caption>
	        <colgroup>
	            <col style="width:120px" />
	            <col />
	        </colgroup>
	        <tbody>
	            <tr>
	                <th scope="row">고유번호</th>
	                <td><c:out value="${result.esntlId}"/></td>
	            </tr>
	            <tr>
	                <th scope="row">회원ID</th>
	                <td><c:out value="${result.emplyrId}"/></td>
	            </tr>
	            <tr>
	                <th scope="row">회원명</th>
	                <td><c:out value="${result.userNm}"/></td>
	            </tr>
	            <tr>
	                <th scope="row">비밀번호</th>
	                <td><button type="button" id="btn-pw" class="btn spot">비밀번호 재발급</button></td>
	            </tr>
	            <tr>
	                <th scope="row">이메일주소</th>
	                <td><c:out value="${result.emailAdres}"/></td>
	            </tr>
	            <tr>
	                <th scope="row">가입일</th>
	                <td><fmt:formatDate value="${result.sbscrbDe}"  pattern="yyyy-MM-dd"/> </td>
	            </tr>
	            
	        </tbody>
	    </table>
		<div class="btn-cont ac">
			<c:url var="listUrl" value="/admin/member/memberList.do${_BASE_PARAM}"/>
		    <a href="${listUrl}" class="btn">목록</a>
		</div>
	</div>
</div>

<script>
//비밀번호 재발급
$("#btn-pw").click(function(){
	$.ajax({
		url : "/admin/member/changePwRandom.do",
		type : "post",
		//data : {"emplyrId" : "${result.emplyrId}", "esntlId" : "${result.esntlId}", "emailAdres" : "${result.emailAdres}"},
		data : {"emplyrId" : "${result.emplyrId}", "esntlId" : "${result.esntlId}", "emailAdres" : "sj1004class@naver.com"},
		//data : {"emplyrId" : "${result.emplyrId}", "esntlId" : "${result.esntlId}", "emailAdres" : "sj1004class@dataeum.kr"},
		dataType : "json",
		success : function(data){
			if(data.successYn == "Y"){
				alert("비밀번호 재발급이 완료되었습니다.");
			}else{
				alert(data.message);
			}
		}, error : function(){
			alert("error");
		}
	});
	
	return false;
});
</script>

<c:import url="/template/footer.do" charEncoding="utf-8"/>