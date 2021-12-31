var generatedConfig = require("./scalajs.webpack.config");
var path = require("path");

module.exports = generatedConfig;

module.exports.devServer = {
    static: [
        __dirname,
        path.join(__dirname, "../../../../src/main/resources")
    ],
    port: 8080
    // hot: true
};

module.exports.mode = "development";

module.exports.performance = {
    maxEntrypointSize: 400000
};
