<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns:h="http://xmlns.jcp.org/jsf/html" xmlns:f="http://xmlns.jcp.org/jsf/core">
    <head>
        <title>Item Board</title>
        <%--meta link--%>
        <%@ include file="common/meta.jsp" %>

    </head>
    <body>

        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="<c:url value="/resources/item-board_resources/js/materialize.js"/>"></script>

        <%--header link--%>
        <%@ include file="common/header.jsp" %>



        <br>

        <div class="container">
            <br>
            <br>
            <a href="item.html?id=${displayitem.id}">

                <div class="header col s12 light" >
                    <figure style="margin-left: -50px; position: relative;"tabindex="1">  <img src="${displayitem.pic}"style ="display: inline-block; float: left; align-content: center; padding: 0px; " width=58% height=58% /><figcaption style=" font-family: cursive; color:black; text-shadow: 5px 2px 4px grey; font-size: xx-large; width: 510px; height: 95px;"><p style="text-align: center; ">${displayitem.name}</p></figcaption >
                        

                        <div style="  margin-left: 550px; margin-top: -50px; font-family: cursive; font-size: 17pt;">
                            <p style="color:greenyellow; margin-top: -100px">
                               Price: ${displayitem.price} UAH</p>
                            <p style="margin-top: 10px;"> <img src="http://s1.iconbird.com/ico/2013/11/504/w128h1281385326570phone.png" style="width: 22px; height: 22px; margin-top: -40px;">
                                ${displayitem.phone} </p>
                            <p style="color:black; text-shadow: 5px 2px 4px white; margin-top: 10px; margin-left: 50px;">
                                <img src="http://s1.iconbird.com/ico/1012/EcommerceBusinessIcons/w128h1281350822895admin128x128.png" style="width: 128px; height: 128px; margin-left: -70px; float:left;"></p> 
                            <div class="owner" style="width: 445px; height: 130px; font-size: 16pt; background-color: lightblue;"> Owner:</p> ${displayitem.owner}</p>
                                <p>
                                    City: ${displayitem.city}</p>
                                <p>Date: ${displayitem.date}</p></div>

<c:if test="${not empty login}" >
            <button class="btn-large waves-effect waves-light orange" type="submit" name="action" style=" margin-top: 20px;">
                <a class="white-text"  href="pay.html?id=${displayitem.id}"> Pay
                    <i class="material-icons right">payment</i></a>
            </button>
        </c:if>
                            <%--<hr>--%>
                        </div>
                        <br>
                        <br>
                        <br>
                        </a>                          
                </div>
        </div>
        

        <br>
        <br>

        <%--footer link--%>
        <%@ include file="common/footer.jsp" %>

    </body>
</html>

