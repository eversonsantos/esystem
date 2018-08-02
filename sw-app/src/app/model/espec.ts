import { Classe } from './classe';
export class Espec {

    private _id : number;
    private _nome : string;
    private _classe : Classe;

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

    public getClasse () : Classe {
        return this._classe;
    }

    public setClasse (classe : Classe) : void {
        this._classe = classe;
    }
}
