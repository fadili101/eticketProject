import { User } from "./user";
import { Workflow } from "./workflow";

export interface Profil {
    profilId: number;
    nomProfil: string;
    description: string;
    users: User[];
    assignedWorkflows: Workflow[];
}
