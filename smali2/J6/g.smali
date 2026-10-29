.class public final synthetic LJ6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lg3/A;

.field public final synthetic r:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lg3/A;Ljava/util/List;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ6/g;->q:Lg3/A;

    iput-object p2, p0, LJ6/g;->r:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, LJ6/g;->q:Lg3/A;

    iget-object p0, p0, LJ6/g;->r:Ljava/util/List;

    invoke-static {v0, p0}, LJ6/h;->r(Lg3/A;Ljava/util/List;)V

    return-void
.end method
