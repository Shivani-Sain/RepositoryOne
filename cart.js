var cartcount = 0;
var obj = [];                                       
function addToCart(id){ 
  cartcount = cartcount+1;
  document.getElementById('cart').innerHTML=('<span class="features">'+cartcount+'</span>');
  var price = id.getElementsByTagName('p');
  var heading = id.getElementsByTagName('h4');
  var img = id.getElementsByTagName("img");
  obj.push({"img":img[0].src,"heading":heading[0].innerHTML,"price":price[0].innerHTML});
  localStorage.setItem("cart",JSON.stringify(obj));
  console.log(localStorage);
}