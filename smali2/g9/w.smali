.class final Lg9/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/w$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Class;

.field private final b:Ljava/lang/reflect/Method;

.field private final c:LP8/v;

.field final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:LP8/u;

.field private final g:LP8/x;

.field private final h:Z

.field private final i:Z

.field private final j:Z

.field private final k:[Lg9/s;

.field final l:Z


# direct methods
.method constructor <init>(Lg9/w$a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lg9/w$a;->b:Ljava/lang/Class;

    iput-object v0, p0, Lg9/w;->a:Ljava/lang/Class;

    iget-object v0, p1, Lg9/w$a;->c:Ljava/lang/reflect/Method;

    iput-object v0, p0, Lg9/w;->b:Ljava/lang/reflect/Method;

    iget-object v0, p1, Lg9/w$a;->a:Lg9/y;

    iget-object v0, v0, Lg9/y;->c:LP8/v;

    iput-object v0, p0, Lg9/w;->c:LP8/v;

    iget-object v0, p1, Lg9/w$a;->o:Ljava/lang/String;

    iput-object v0, p0, Lg9/w;->d:Ljava/lang/String;

    iget-object v0, p1, Lg9/w$a;->s:Ljava/lang/String;

    iput-object v0, p0, Lg9/w;->e:Ljava/lang/String;

    iget-object v0, p1, Lg9/w$a;->t:LP8/u;

    iput-object v0, p0, Lg9/w;->f:LP8/u;

    iget-object v0, p1, Lg9/w$a;->u:LP8/x;

    iput-object v0, p0, Lg9/w;->g:LP8/x;

    iget-boolean v0, p1, Lg9/w$a;->p:Z

    iput-boolean v0, p0, Lg9/w;->h:Z

    iget-boolean v0, p1, Lg9/w$a;->q:Z

    iput-boolean v0, p0, Lg9/w;->i:Z

    iget-boolean v0, p1, Lg9/w$a;->r:Z

    iput-boolean v0, p0, Lg9/w;->j:Z

    iget-object v0, p1, Lg9/w$a;->w:[Lg9/s;

    iput-object v0, p0, Lg9/w;->k:[Lg9/s;

    iget-boolean p1, p1, Lg9/w$a;->x:Z

    iput-boolean p1, p0, Lg9/w;->l:Z

    return-void
.end method

.method static b(Lg9/y;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lg9/w;
    .registers 4

    new-instance v0, Lg9/w$a;

    invoke-direct {v0, p0, p1, p2}, Lg9/w$a;-><init>(Lg9/y;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    invoke-virtual {v0}, Lg9/w$a;->b()Lg9/w;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method a(Ljava/lang/Object;[Ljava/lang/Object;)LP8/B;
    .registers 15

    iget-object v0, p0, Lg9/w;->k:[Lg9/s;

    array-length v1, p2

    array-length v2, v0

    if-ne v1, v2, :cond_50

    new-instance v3, Lg9/v;

    iget-object v4, p0, Lg9/w;->d:Ljava/lang/String;

    iget-object v5, p0, Lg9/w;->c:LP8/v;

    iget-object v6, p0, Lg9/w;->e:Ljava/lang/String;

    iget-object v7, p0, Lg9/w;->f:LP8/u;

    iget-object v8, p0, Lg9/w;->g:LP8/x;

    iget-boolean v9, p0, Lg9/w;->h:Z

    iget-boolean v10, p0, Lg9/w;->i:Z

    iget-boolean v11, p0, Lg9/w;->j:Z

    invoke-direct/range {v3 .. v11}, Lg9/v;-><init>(Ljava/lang/String;LP8/v;Ljava/lang/String;LP8/u;LP8/x;ZZZ)V

    iget-boolean v2, p0, Lg9/w;->l:Z

    if-eqz v2, :cond_21

    add-int/lit8 v1, v1, -0x1

    :cond_21
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_27
    if-ge v4, v1, :cond_38

    aget-object v5, p2, v4

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    aget-object v5, v0, v4

    aget-object v6, p2, v4

    invoke-virtual {v5, v3, v6}, Lg9/s;->a(Lg9/v;Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_27

    :cond_38
    invoke-virtual {v3}, Lg9/v;->k()LP8/B$a;

    move-result-object p2

    new-instance v0, Lg9/o;

    iget-object v1, p0, Lg9/w;->a:Ljava/lang/Class;

    iget-object p0, p0, Lg9/w;->b:Ljava/lang/reflect/Method;

    invoke-direct {v0, v1, p1, p0, v2}, Lg9/o;-><init>(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/List;)V

    const-class p0, Lg9/o;

    invoke-virtual {p2, p0, v0}, LP8/B$a;->g(Ljava/lang/Class;Ljava/lang/Object;)LP8/B$a;

    move-result-object p0

    invoke-virtual {p0}, LP8/B$a;->b()LP8/B;

    move-result-object p0

    return-object p0

    :cond_50
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Argument count ("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ") doesn\'t match expected count ("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p2, v0

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
