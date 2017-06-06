

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> 

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
</head>
<body>
<div class="container" 	>
<div class="row">
<div class="col-lg-4 col-md-3 col-sm-2">
</div>
<div class="col-lg-4 col-md-6 col-sm-8">
  
 <form action="ProductServlet" method="post">
 <h2>Add Product </h2>
    <div class="form-group">
      <label > ProductName</label>
      <input type="text" class="form-control"  name="name"  placeholder="Enter Product Name" name="email">
    </div>
    <div class="form-group">
      <label >Company</label>
      <input type="text" class="form-control" name="cname" placeholder="Enter Company Name" name="password">
    </div>
<div class="form-group">
      <label > Model</label>
      <input type="text" class="form-control"  name="model"  placeholder="Enter Model type" name="email">
    </div>

<div class="form-group">
      <label > Price</label>
      <input type="number" class="form-control"  name="price"  placeholder="Enter Price" name="email">
    </div>
   
	<input type="submit" value="Submit" class="btn btn-success">
	<button formaction="showDetails"  value="ShowDetails" class="btn btn-primary" >ShowDetails</button>
  
  </form>
</div>
</div>
<div class="col-lg-4 col-md-3 col-sm-2">
</div>
</div>
 
 </body>
</html>












<!-- <h2>Add Product </h2>
<form action="ProductServlet" method="post">

<b>Product Name</b><input type="text" name="name"><br>
<b>Company</b><input type="text" name="cname"><br>
<b>Model</b><input type="text" name="model"><br>
<b>Price</b><input type="number" name="price"><br>

<input type="submit" value="Submit">
<button formaction="showDetails"  value="ShowDetails">ShowDetails</button>
</form>
 -->
