.class public final synthetic LM6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/c$a;


# instance fields
.field public final synthetic a:LM6/u;

.field public final synthetic b:Z

.field public final synthetic c:Landroidx/lifecycle/q;


# direct methods
.method public synthetic constructor <init>(LM6/u;ZLandroidx/lifecycle/q;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM6/q;->a:LM6/u;

    iput-boolean p2, p0, LM6/q;->b:Z

    iput-object p3, p0, LM6/q;->c:Landroidx/lifecycle/q;

    return-void
.end method


# virtual methods
.method public final a(Lg3/x;Lg3/x;I)V
    .registers 10

    iget-object v0, p0, LM6/q;->a:LM6/u;

    iget-boolean v1, p0, LM6/q;->b:Z

    iget-object v2, p0, LM6/q;->c:Landroidx/lifecycle/q;

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-static/range {v0 .. v5}, LM6/u;->i(LM6/u;ZLandroidx/lifecycle/q;Lg3/x;Lg3/x;I)V

    return-void
.end method
