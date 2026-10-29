.class public final synthetic LG7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/u;


# instance fields
.field public final synthetic q:LS1/a;


# direct methods
.method public synthetic constructor <init>(LS1/a;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG7/a;->q:LS1/a;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/x;Landroidx/lifecycle/q$a;)V
    .registers 3

    iget-object p0, p0, LG7/a;->q:LS1/a;

    invoke-static {p0, p1, p2}, LG7/d;->a(LS1/a;Landroidx/lifecycle/x;Landroidx/lifecycle/q$a;)V

    return-void
.end method
