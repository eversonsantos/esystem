export class Personagem {

    private _id : number;
    private _nome : string;
    

    public getId () : number {
        return this._id;
    }

    public setId (id : number) : void {
        this._id = id;
    }

    public getNome () : string {
        return this._nome;
    }

    public setNome (nome : string) : void {
        this._nome = nome;
    }
    
}
