(ns com.anonimito.barebones-clojure
  (:gen-class)
  (:require [cider.nrepl :refer [cider-nrepl-handler]]
            [nrepl.server :as nrepl]))

(defn -main
  [& args]
  (nrepl/start-server :port    5555
                      :handler cider-nrepl-handler)
  (println "nREPL started"))
