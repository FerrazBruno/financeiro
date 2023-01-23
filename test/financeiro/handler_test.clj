(ns financeiro.handler-test
  (:require [midje.sweet :refer :all]
            [ring.mock.request :as mock]
            [financeiro.handler :refer :all]))

(facts "Da um 'Ola mundo' na rota raiz"
       (let [response (app (mock/request :get "/"))]
         (fact "o status da resposta eh 200"
               (:status response) => 200)
         (fact "o texto do corpo eh 'Ola mundo'"
               (:body response) => "Ola mundo")))

(facts "Rota invalida nao existe"
       (let [response (app (mock/request :get "/invalid"))]
         (fact "o codigo de erro eh 404"
               (:status response) => 404)
         (fact "o texto do corpor eh 'Recurso nao encontrado'"
               (:body response) => "Recurso nao encontrado")))

(facts "O saldo iniciao eh 0"
       (let [reponse (app (mock/request :get "/saldo"))]
         (fact "o status da resposta eh 200"
               (:status response) => 200))

       (fact "o texto do corpo eh '0'"
             (:body response) => "0"))
