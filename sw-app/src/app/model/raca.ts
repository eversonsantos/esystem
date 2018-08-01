export class Raca {

    private _codigo : number;
    private _nome : string;

    public getCodigo () : number {
        return this._codigo;
    }

    public setCodigo (codigo : number) : void {
        this._codigo =  codigo;
    }

    public getNome () : string {
        return this._nome;
    }

    public setNome (nome : string) : void {
        this._nome =  nome;
    }
}
