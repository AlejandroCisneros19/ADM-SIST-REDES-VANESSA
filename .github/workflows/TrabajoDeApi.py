import requests 
  
response = requests.get('https://api.coindesk.com/v1/bpi/currentprice.json') 
  
body = response.json()
print(body) 
print(response.headers) 

cuerpo = open("cuerpo.txt", "w")
cuerpo.write(str(body))
cuerpo.close()

encabezado = open("encabezado.txt", "w")
encabezado.write(str(response.headers))
encabezado.close()