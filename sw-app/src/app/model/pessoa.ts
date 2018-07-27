export class Pessoa {

    private _nome : string;

    public getNome () {
        return this._nome;
    }

    public setNome (_nome : string){
        this._nome = _nome;
    }
}
