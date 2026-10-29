.class public final enum Ld6/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum A:Ld6/f;

.field public static final enum B:Ld6/f;

.field public static final enum C:Ld6/f;

.field public static final enum D:Ld6/f;

.field private static final synthetic E:[Ld6/f;

.field private static final synthetic F:Lo8/a;

.field public static final enum s:Ld6/f;

.field public static final enum t:Ld6/f;

.field public static final enum u:Ld6/f;

.field public static final enum v:Ld6/f;

.field public static final enum w:Ld6/f;

.field public static final enum x:Ld6/f;

.field public static final enum y:Ld6/f;

.field public static final enum z:Ld6/f;


# instance fields
.field private final q:I

.field private final r:I


# direct methods
.method static constructor <clinit>()V
    .registers 6

    new-instance v0, Ld6/f;

    sget v1, LI2/f;->e:I

    sget v2, LI2/e;->a:I

    const-string v3, "GENERAL"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Ld6/f;-><init>(Ljava/lang/String;III)V

    sput-object v0, Ld6/f;->s:Ld6/f;

    new-instance v0, Ld6/f;

    sget v1, LI2/f;->f:I

    sget v2, LI2/e;->b:I

    const-string v3, "GRAPHIC"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Ld6/f;-><init>(Ljava/lang/String;III)V

    sput-object v0, Ld6/f;->t:Ld6/f;

    new-instance v0, Ld6/f;

    sget v1, LI2/f;->g:I

    sget v2, LI2/e;->c:I

    const-string v3, "LONDON_UG"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Ld6/f;-><init>(Ljava/lang/String;III)V

    sput-object v0, Ld6/f;->u:Ld6/f;

    new-instance v0, Ld6/f;

    sget v1, LI2/f;->i:I

    sget v2, LI2/e;->e:I

    const-string v3, "NDOT"

    const/4 v4, 0x3

    invoke-direct {v0, v3, v4, v1, v2}, Ld6/f;-><init>(Ljava/lang/String;III)V

    sput-object v0, Ld6/f;->v:Ld6/f;

    new-instance v0, Ld6/f;

    sget v1, LI2/f;->l:I

    sget v2, LI2/e;->h:I

    const-string v3, "NTYPE"

    const/4 v4, 0x4

    invoke-direct {v0, v3, v4, v1, v2}, Ld6/f;-><init>(Ljava/lang/String;III)V

    sput-object v0, Ld6/f;->w:Ld6/f;

    new-instance v0, Ld6/f;

    sget v2, LI2/f;->h:I

    sget v3, LI2/e;->d:I

    const-string v4, "LONDON_UG_16B"

    const/4 v5, 0x5

    invoke-direct {v0, v4, v5, v2, v3}, Ld6/f;-><init>(Ljava/lang/String;III)V

    sput-object v0, Ld6/f;->x:Ld6/f;

    new-instance v0, Ld6/f;

    sget v2, LI2/f;->j:I

    sget v3, LI2/e;->f:I

    const-string v4, "NDOT_16B"

    const/4 v5, 0x6

    invoke-direct {v0, v4, v5, v2, v3}, Ld6/f;-><init>(Ljava/lang/String;III)V

    sput-object v0, Ld6/f;->y:Ld6/f;

    new-instance v0, Ld6/f;

    const/4 v2, 0x7

    sget v3, LI2/e;->i:I

    const-string v4, "NTYPE_16B"

    invoke-direct {v0, v4, v2, v1, v3}, Ld6/f;-><init>(Ljava/lang/String;III)V

    sput-object v0, Ld6/f;->z:Ld6/f;

    new-instance v0, Ld6/f;

    sget v1, LI2/f;->m:I

    sget v2, LI2/e;->j:I

    const-string v3, "OLD_QUICKLOOK"

    const/16 v4, 0x8

    invoke-direct {v0, v3, v4, v1, v2}, Ld6/f;-><init>(Ljava/lang/String;III)V

    sput-object v0, Ld6/f;->A:Ld6/f;

    new-instance v0, Ld6/f;

    sget v1, LI2/f;->o:I

    sget v2, LI2/e;->l:I

    const-string v3, "SPACE_AGE"

    const/16 v4, 0x9

    invoke-direct {v0, v3, v4, v1, v2}, Ld6/f;-><init>(Ljava/lang/String;III)V

    sput-object v0, Ld6/f;->B:Ld6/f;

    new-instance v0, Ld6/f;

    sget v1, LI2/f;->n:I

    sget v2, LI2/e;->k:I

    const-string v3, "POLYLINE"

    const/16 v4, 0xa

    invoke-direct {v0, v3, v4, v1, v2}, Ld6/f;-><init>(Ljava/lang/String;III)V

    sput-object v0, Ld6/f;->C:Ld6/f;

    new-instance v0, Ld6/f;

    sget v1, LI2/f;->k:I

    sget v2, LI2/e;->g:I

    const-string v3, "NSEGMENTS"

    const/16 v4, 0xb

    invoke-direct {v0, v3, v4, v1, v2}, Ld6/f;-><init>(Ljava/lang/String;III)V

    sput-object v0, Ld6/f;->D:Ld6/f;

    invoke-static {}, Ld6/f;->d()[Ld6/f;

    move-result-object v0

    sput-object v0, Ld6/f;->E:[Ld6/f;

    invoke-static {v0}, Lo8/b;->a([Ljava/lang/Enum;)Lo8/a;

    move-result-object v0

    sput-object v0, Ld6/f;->F:Lo8/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .registers 5

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Ld6/f;->q:I

    iput p4, p0, Ld6/f;->r:I

    return-void
.end method

.method private static final synthetic d()[Ld6/f;
    .registers 12

    sget-object v0, Ld6/f;->s:Ld6/f;

    sget-object v1, Ld6/f;->t:Ld6/f;

    sget-object v2, Ld6/f;->u:Ld6/f;

    sget-object v3, Ld6/f;->v:Ld6/f;

    sget-object v4, Ld6/f;->w:Ld6/f;

    sget-object v5, Ld6/f;->x:Ld6/f;

    sget-object v6, Ld6/f;->y:Ld6/f;

    sget-object v7, Ld6/f;->z:Ld6/f;

    sget-object v8, Ld6/f;->A:Ld6/f;

    sget-object v9, Ld6/f;->B:Ld6/f;

    sget-object v10, Ld6/f;->C:Ld6/f;

    sget-object v11, Ld6/f;->D:Ld6/f;

    filled-new-array/range {v0 .. v11}, [Ld6/f;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ld6/f;
    .registers 2

    const-class v0, Ld6/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ld6/f;

    return-object p0
.end method

.method public static values()[Ld6/f;
    .registers 1

    sget-object v0, Ld6/f;->E:[Ld6/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld6/f;

    return-object v0
.end method


# virtual methods
.method public final e()I
    .registers 1

    iget p0, p0, Ld6/f;->q:I

    return p0
.end method

.method public final f()I
    .registers 1

    iget p0, p0, Ld6/f;->r:I

    return p0
.end method
