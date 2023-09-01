import { TypeDepartement } from "./typeDepartement";
import { User } from "./user";

export interface Departement {
    departement_id: number;
    idDepartementParent: number | null;
    departement: string;
    flagTraitement: number;
    typeDepartement: TypeDepartement;
    responsable: User;
}