Autenticação e Autorização com Spring boot - Java e Keycloak

Suba uma imagem docker do keycloak:

docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:23.0.6 start-dev

Alguns exemplos de requisições:

Obs: Não esqueça de trocar os dados necessários

Token keycloak:
curl --location 'http://localhost:8080/realms/keyTest/protocol/openid-connect/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'client_id=app_keyTest' \
--data-urlencode 'username=emerson_admin' \
--data-urlencode 'password=admin' \
--data-urlencode 'grant_type=password'

Gere um token para sua aplicação:

curl --location 'http://localhost:8081/token/' \
--header 'Content-Type: application/json' \
--data '{
    "clientId": "app_keyTest",
    "password": "user",
    "grantType": "password",
    "username": "emerson_keytest"
}'

Chando uma rota de produtos:

Obs: Muda o método para GET/POST

curl --location 'http://localhost:8081/products/' \
--header 'Cookie: JSESSIONID=A719640D29A05BCE3AF2626274187147'

