.class public final synthetic LG7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Z

.field public final synthetic r:LJ7/i;


# direct methods
.method public synthetic constructor <init>(ZLJ7/i;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LG7/b;->q:Z

    iput-object p2, p0, LG7/b;->r:LJ7/i;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-boolean v0, p0, LG7/b;->q:Z

    iget-object p0, p0, LG7/b;->r:LJ7/i;

    check-cast p1, LO1/b;

    invoke-static {v0, p0, p1}, LG7/d;->b(ZLJ7/i;LO1/b;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
