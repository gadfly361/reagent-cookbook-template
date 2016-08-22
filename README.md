# Reagent Cookbook Template

This is a leiningen template specifically for following along with [reagent-cookbook](https://github.com/reagent-project/reagent-cookbook) recipes.

# Usage

## Create an application.

```
$ lein new rc <name of app>
```

## Compile cljs to js

### For development:

```
$ lein figwheel dev
```

Wait a bit, then browse to [http://localhost:3449](http://localhost:3449).

### For production:

```
$ lein cljsbuild once prod
```

Open `resources/public/index.html` to view your application.
