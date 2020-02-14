const fs = require('fs');
const path = require('path');
const { execSync } = require('child_process');

const SRCDIR = path.resolve(`${__dirname}/../src`);
let BUILDDIR = path.resolve(`${__dirname}/../dist`);
if (!fs.lstatSync(BUILDDIR).isDirectory()) {
  fs.mkdirSync(BUILDDIR);
}

const kts = execSync("find src -type f -name '*.kt'")
  .toString()
  .split('\n')
  .filter(kt => !!kt);

function compile(kts=[]) {
  kts
    .map(kt => {
      return kt.replace('src/', '').replace('.kt', '');
    })
    .forEach(kt => {
      execSync(`INPUT=${kt}.kt OUTPUT=${kt}.js npm run compile`);
    });
}

compile(kts);
