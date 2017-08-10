(ns com.jebbeich.simple
  (:gen-class
   :methods [^:static [handler [Object com.amazonaws.services.lambda.runtime.Context] Object]])
  (:import (com.amazonaws.services.lambda.runtime Context)))

(defn -handler [^Object req ^Context ctx]
  "hello world")
