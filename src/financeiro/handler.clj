(ns financeiro.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] "Ola mundo")
  (GET "/" [] "0")
  (route/not-found "Recurso nao encontrado"))

(def app
  (wrap-defaults app-routes site-defaults))
