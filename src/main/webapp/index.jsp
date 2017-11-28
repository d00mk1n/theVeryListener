<html>
  <head>
    <meta http-equiv="refresh" content="10">
  </head>
  <title>Listener</title>
  <body>
    <h3> Last received messages </h3>
    <table border="1" cellpadding="10">
      <tr>
      <th>Id</th>
      <th>Data</th>
      <th>PublishTime</th>
      </tr>
      <%= PubSubHome.getReceivedMessages() %>
    </table>
  </body>
</html>
