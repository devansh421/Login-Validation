<html>
<body>
 <form action='validation' method='post'>
  <table style='border:2px solid blue;font-size:20px' cellpadding='10px'>
   <tr>
    <td>Enter user name</td>
    <td><input type='text' value="${uid}" name='user' required></td>
   </tr>
   <tr>
    <td>Enter password</td>
    <td><input type='password' name='pass' required></td>
   </tr>
   <tr>
    <td colspan="2" align="right">
     <button>Login</button>
    </td>
   </tr>
   <tr>
    <td colspan="2" align="center">
      <label style='color:red'>${msg}</label>
    </td>
   </tr>
  </table>
 </form> 
</body>
</html>
