<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ include file="include/begin-html.jsp" %>

<form class="form-horizontal" action="do?command=login" method="POST">
<fieldset>

<!-- Form Name -->
<legend>Login Form</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Login</label>
  <div class="col-md-4">
  <input name="textinput" class="form-control input-md" id="textinput" required="" type="text" placeholder="input login here">
  <span class="help-block">Your login </span>
  </div>
</div>

<!-- Password input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="password">Password</label>
  <div class="col-md-4">
    <input name="password" class="form-control input-md" id="password" required="" type="password" placeholder="">
    <span class="help-block">min 8 symvols</span>
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="submitbutton"></label>
  <div class="col-md-4">
    <button name="submitbutton" class="btn btn-primary" id="submitbutton">Signap</button>
  </div>
</div>

</fieldset>
</form>


<p>Cmd Login: ${message}</p>

<%@ include file="include/end-html.jsp" %>