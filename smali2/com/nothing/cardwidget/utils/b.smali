.class public final synthetic Lcom/nothing/cardwidget/utils/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic a:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/utils/b;->a:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/utils/b;->a:Lcom/nothing/cardwidget/utils/AsyncServiceBinder;

    invoke-static {p0}, Lcom/nothing/cardwidget/utils/AsyncServiceBinder;->a(Lcom/nothing/cardwidget/utils/AsyncServiceBinder;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
