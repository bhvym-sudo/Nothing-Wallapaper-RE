.class public final synthetic LG7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:LJ7/i;

.field public final synthetic r:LN1/a;


# direct methods
.method public synthetic constructor <init>(LJ7/i;LN1/a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG7/e;->q:LJ7/i;

    iput-object p2, p0, LG7/e;->r:LN1/a;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, LG7/e;->q:LJ7/i;

    iget-object p0, p0, LG7/e;->r:LN1/a;

    check-cast p1, LO1/b;

    invoke-static {v0, p0, p1}, LG7/d$e$a;->c(LJ7/i;LN1/a;LO1/b;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
