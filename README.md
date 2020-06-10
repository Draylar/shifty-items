# Shifty Items

Request:

![](https://i.imgur.com/B9FhXL5.png)

Shifty Items is a **client-only** snapshot mod for **Fabric** that allows you to interact with blocks while holding certain items *while shifting*. It defaults to allowing `minecraft:shears`, but more items can be added in the config at `config/shiftyitems.json5`:

```json5
{ 
	// A list of items that will allow for interactions while shifting.
	"validItems": [ 
		"minecraft:shears"
	]
}
```

To test this out, you can hold shears, shift, and try to shear a pumpkin. It will succeed while keeping you shifting (most of the time). This mod works on vanilla servers.

### License

This mod is licensed under CC0-1.0.
