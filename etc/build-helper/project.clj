;; Copyright 2014 Red Hat, Inc, and individual contributors.
;;
;; Licensed under the Apache License, Version 2.0 (the "License");
;; you may not use this file except in compliance with the License.
;; You may obtain a copy of the License at
;;
;; http://www.apache.org/licenses/LICENSE-2.0
;;
;; Unless required by applicable law or agreed to in writing, software
;; distributed under the License is distributed on an "AS IS" BASIS,
;; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
;; See the License for the specific language governing permissions and
;; limitations under the License.

;; *** NOTE: update the version in docs.clj when you change it here ***
(defproject org.immutant/build-helper "0.1.6"
  :description "A plugin to aid in building Immutant"
  :url "https://github.com/immutant/immutant"
  :license {:name "Apache Software License - v 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"
            :distribution :repo}
  :dependencies [[org.clojars.tcrawley/codox.core "0.8.0a"]
                 ;;[codox/codox.core "0.8.0"]
                 [markdown-clj "0.9.44"]]
  :eval-in-leiningen true
  :signing {:gpg-key "BFC757F9"})