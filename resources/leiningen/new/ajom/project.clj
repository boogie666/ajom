(defproject {{raw-name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.293"]
                 [org.clojure/core.async "0.2.395"]]

  :source-paths ["src/cljs"]
  :profiles {:dev {:source-paths ["src/dev"]
                   :dependencies [[thheller/shadow-build "1.0.234"]
                                  [thheller/shadow-devtools "0.1.45"]]}})
