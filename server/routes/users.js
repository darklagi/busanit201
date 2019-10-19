var express = require('express');
var router = express.Router();

/** POST LOGIN */
router.post('/auth', function(req, res, next) {
  res.json({id: req.body.id, 
    password: req.body.password
  })
});

module.exports = router;
