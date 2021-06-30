<html lang="en">
<head>
  <title>Spring MVC Example</title>
</head>
<body>

	<form action="/signup" method="post" role="form">
				
					 
					<label for="exampleInputtext1">
						Name:
					</label>
					<input type="text" class="form-control" path="name"  id="exampleInputtext1" />
				
					 
					<label for="user">
						MailId:
					</label>
					<input type="email" class="form-control"  path="email" id="exampleInputemail1" />
				
					 
					<label for="exampleInputpassword1">
						Password:
					</label>
					<input type="password" class="form-control" path="password" id="exampleInputpassword1" />
				
				<button type="submit" class="btn btn-primary">
					Submit
				</button>
				
			</form>
</body>
</html>