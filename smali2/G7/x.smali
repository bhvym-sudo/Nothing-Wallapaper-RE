.class public final synthetic LG7/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/d0;


# instance fields
.field public final synthetic q:Landroidx/cardview/widget/CardView;

.field public final synthetic r:LG7/v$c$b$a$a$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/cardview/widget/CardView;LG7/v$c$b$a$a$a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG7/x;->q:Landroidx/cardview/widget/CardView;

    iput-object p2, p0, LG7/x;->r:LG7/v$c$b$a$a$a;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .registers 2

    iget-object v0, p0, LG7/x;->q:Landroidx/cardview/widget/CardView;

    iget-object p0, p0, LG7/x;->r:LG7/v$c$b$a$a$a;

    invoke-static {v0, p0}, LG7/v$c$b$a$a;->s(Landroidx/cardview/widget/CardView;LG7/v$c$b$a$a$a;)V

    return-void
.end method
