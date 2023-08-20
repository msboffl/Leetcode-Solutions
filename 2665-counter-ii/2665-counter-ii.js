/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let initial = init;
    return {
        increment: function() {
            initial++;
            return initial;
        },
        reset: function() {
            initial = init;
            return initial;
        },
        decrement: function() {
            initial--;
            return initial;
        },
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */