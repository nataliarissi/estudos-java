package Padaria;

public class ItemNoCarrinho {
	 
	public ItemNoCarrinho(int quantidade, Produto item, float subtotal) {
		_quantidade = quantidade;
		_item = item;
		_subtotal = subtotal;
	}

	private int _quantidade;
	private Produto _item;
	private float _subtotal;
    
	public float getSubtotal() {
		return _subtotal;
	}
	 
    @Override
    public String toString(){
        return "Quantidade de itens no carrinho: " + _quantidade
            + ", itens: " + _item
            + ", subtotal: " + _subtotal;
    }
}
