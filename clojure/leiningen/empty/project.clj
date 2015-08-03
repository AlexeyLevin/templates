(defproject hello "0.1-SNAPSHOT"
	:source-paths ["src/main/clojure"]
	:resource-paths ["src/main/resources"]
	:test-paths ["src/test/clojure"]
	:target-path "target/%s/"
    :dependencies [[org.clojure/clojure "1.7.0"]]
    :main li.barlog.app
    :profiles {:uberjar {:aot :all}})
