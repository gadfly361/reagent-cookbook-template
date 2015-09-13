# Reagent Cookbook Template

This is a leiningen template specifically for following along with [reagent-cookbook](https://github.com/reagent-project/reagent-cookbook) recipes.

# Usage

Create an application.

```
$ lein new rc <name of app>
```

Compile clojurescript files to a javascript file.

*Development:*

```
$ lein cljsbuild once dev
```

*Production:*

```
$ lein cljsbuild once prod
```

Open `resources/public/index.html` to view your application.
