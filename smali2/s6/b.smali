.class public final Ls6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls6/b$a;
    }
.end annotation


# static fields
.field public static final d:Ls6/b$a;

.field private static final e:Lq6/b;


# instance fields
.field private a:Z

.field private b:Ls6/a;

.field private c:Ls6/a$e;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Ls6/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls6/b$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Ls6/b;->d:Ls6/b$a;

    new-instance v0, Lq6/b;

    const-string v1, "Movement"

    invoke-direct {v0, v1}, Lq6/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Ls6/b;->e:Lq6/b;

    return-void
.end method

.method public constructor <init>(Ls6/a;Ls6/a$e;Z)V
    .registers 5

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p3, p0, Ls6/b;->a:Z

    .line 3
    iput-object p1, p0, Ls6/b;->b:Ls6/a;

    .line 4
    iput-object p2, p0, Ls6/b;->c:Ls6/a$e;

    return-void
.end method

.method public synthetic constructor <init>(Ls6/a;Ls6/a$e;ZILkotlin/jvm/internal/h;)V
    .registers 6

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_5

    const/4 p1, 0x0

    :cond_5
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_b

    .line 5
    sget-object p2, Ls6/a$e$c;->s:Ls6/a$e$c;

    :cond_b
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_10

    const/4 p3, 0x0

    .line 6
    :cond_10
    invoke-direct {p0, p1, p2, p3}, Ls6/b;-><init>(Ls6/a;Ls6/a$e;Z)V

    return-void
.end method

.method public static final synthetic a()Lq6/b;
    .registers 1

    sget-object v0, Ls6/b;->e:Lq6/b;

    return-object v0
.end method

.method public static final synthetic b(Ls6/b;Ls6/a;)V
    .registers 2

    iput-object p1, p0, Ls6/b;->b:Ls6/a;

    return-void
.end method


# virtual methods
.method public final c(Ls6/a;)Z
    .registers 7

    const-string v0, "test"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls6/b;->b:Ls6/a;

    sget-object v1, Ls6/a$b;->r:Ls6/a$b;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_29

    if-eqz v0, :cond_1f

    sget-object p1, Ls6/a$a;->r:Ls6/a$a;

    invoke-static {v1, p1}, LB8/h;->c(Ljava/lang/Comparable;Ljava/lang/Comparable;)LB8/c;

    move-result-object p1

    invoke-interface {p1, v0}, LB8/c;->b(Ljava/lang/Comparable;)Z

    move-result p1

    if-nez p1, :cond_27

    :cond_1f
    iget-object p0, p0, Ls6/b;->c:Ls6/a$e;

    invoke-virtual {p0}, Ls6/a$e;->f()Z

    move-result p0

    if-eqz p0, :cond_28

    :cond_27
    return v4

    :cond_28
    return v3

    :cond_29
    sget-object v1, Ls6/a$a;->r:Ls6/a$a;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_41

    if-eqz v0, :cond_39

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3f

    :cond_39
    iget-object p0, p0, Ls6/b;->c:Ls6/a$e;

    instance-of p0, p0, Ls6/a$e$b;

    if-eqz p0, :cond_40

    :cond_3f
    return v4

    :cond_40
    return v3

    :cond_41
    sget-object v1, Ls6/a$d;->r:Ls6/a$d;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5e

    if-eqz v0, :cond_51

    invoke-virtual {v0, v1}, Ls6/a;->d(Ls6/a;)I

    move-result p1

    if-gez p1, :cond_5d

    :cond_51
    iget-object p0, p0, Ls6/b;->c:Ls6/a$e;

    instance-of p1, p0, Ls6/a$e$e;

    if-nez p1, :cond_5d

    instance-of p0, p0, Ls6/a$e$a;

    if-eqz p0, :cond_5c

    goto :goto_5d

    :cond_5c
    return v3

    :cond_5d
    :goto_5d
    return v4

    :cond_5e
    sget-object v1, Ls6/a$c;->r:Ls6/a$c;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7a

    if-eqz v0, :cond_6e

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_78

    :cond_6e
    iget-object p0, p0, Ls6/b;->c:Ls6/a$e;

    sget-object p1, Ls6/a$e$a;->s:Ls6/a$e$a;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_79

    :cond_78
    return v4

    :cond_79
    return v3

    :cond_7a
    new-instance p0, Lh8/m;

    invoke-direct {p0}, Lh8/m;-><init>()V

    throw p0
.end method

.method public final d()Ls6/a$e;
    .registers 1

    iget-object p0, p0, Ls6/b;->c:Ls6/a$e;

    return-object p0
.end method

.method public final e()Z
    .registers 1

    iget-boolean p0, p0, Ls6/b;->a:Z

    return p0
.end method

.method public final f()Z
    .registers 5

    iget-object v0, p0, Ls6/b;->b:Ls6/a;

    if-nez v0, :cond_d

    sget-object p0, Ls6/b;->e:Lq6/b;

    const-string v0, "call moveState but event is null."

    invoke-virtual {p0, v0}, Lq6/b;->e(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0

    :cond_d
    iget-object v1, p0, Ls6/b;->c:Ls6/a$e;

    invoke-virtual {v1}, Ls6/a$e;->g()Ls6/a$e;

    move-result-object v2

    if-nez v2, :cond_19

    invoke-virtual {v0}, Ls6/a;->e()Ls6/a$e;

    move-result-object v2

    :cond_19
    iput-object v2, p0, Ls6/b;->c:Ls6/a$e;

    invoke-virtual {v2}, Ls6/a$e;->e()Z

    move-result v0

    if-nez v0, :cond_24

    const/4 v0, 0x0

    iput-object v0, p0, Ls6/b;->b:Ls6/a;

    :cond_24
    sget-object v0, Ls6/b;->e:Lq6/b;

    iget-object v2, p0, Ls6/b;->c:Ls6/a$e;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " move state from "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " to "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lq6/b;->a(Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public final g(Ls6/a$e;)V
    .registers 3

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Ls6/b;->b:Ls6/a;

    iput-object p1, p0, Ls6/b;->c:Ls6/a$e;

    return-void
.end method

.method public final h(Z)V
    .registers 2

    iput-boolean p1, p0, Ls6/b;->a:Z

    return-void
.end method

.method public final i(Ls6/a$e;)Z
    .registers 3

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls6/b;->c:Ls6/a$e;

    invoke-virtual {v0, p1}, Ls6/a$e;->h(Ls6/a$e;)Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual {p0, p1}, Ls6/b;->g(Ls6/a$e;)V

    const/4 p0, 0x1

    return p0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 6

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Ls6/b;->a:Z

    iget-object v2, p0, Ls6/b;->b:Ls6/a;

    iget-object p0, p0, Ls6/b;->c:Ls6/a$e;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Movement@"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "(visible="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", event="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", state="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
