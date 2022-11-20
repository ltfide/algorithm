function escapeHtml(text) {
   return text.replace(/&/g, "&amp;").replace(/</g, "&lt;").replace(/>/g, "&gt;").replace(/"/g, "&quot;").replace(/'/g, "&apos;");
}

console.log(escapeHtml("aku < kamu"));
console.log(escapeHtml("aku ' kamu"));
console.log(escapeHtml("<>"));
console.log(escapeHtml("Schindler's List"));
